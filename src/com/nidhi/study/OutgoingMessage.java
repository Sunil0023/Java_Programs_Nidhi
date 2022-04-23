package com.nidhi.study;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;

public class OutgoingMessage {
    private static final int INTEGER_LENGTH = 4;
    private static final int ULONG_LONG_LENGTH = 8;
    private final ByteArrayOutputStream message = new ByteArrayOutputStream();

    private static byte[] convertIntToBytes(final int value) {
        final byte[] bytes = new byte[4];

        // $ANALYSIS-IGNORE,codereview.java.rules.casting.RuleCastingPrimitives
        System.out.println("value >> 24 & 0xff"+(byte)(value >> 24 & 0xff));
        bytes[0] = (byte) (value >> 24 & 0xff);

        // $ANALYSIS-IGNORE,codereview.java.rules.casting.RuleCastingPrimitives
        System.out.println("value >> 16 & 0xff: "+(byte) (value >> 16 & 0xff));
        bytes[1] = (byte) (value >> 16 & 0xff);

        // $ANALYSIS-IGNORE,codereview.java.rules.casting.RuleCastingPrimitives
        System.out.println("(byte) (value >> 8 & 0xff)"+(byte) (value >> 8 & 0xff));
        bytes[2] = (byte) (value >> 8 & 0xff);

        // $ANALYSIS-IGNORE,codereview.java.rules.casting.RuleCastingPrimitives
        System.out.println("value >> 0 & 0xff"+(byte) (value >> 0 & 0xff));
        bytes[3] = (byte) (value >> 0 & 0xff);

        System.out.println("bytes: "+bytes);
        return bytes;
    }

    /**
     * Add an integer to the message
     *
     * @param value
     *            The integer to add
     */
    public void putInteger(final int value) {
        writeBytes(convertIntToBytes(value));
    }

    /**
     * Add a string to the message
     *
     * @param string
     *            The string to add
     */
    public void putString(final String string) {
        final byte[] bytes = string.getBytes(StandardCharsets.UTF_8);
        putInteger(bytes.length);
        writeBytes(bytes);
    }

    /**
     * Add a 64 bit integer to the message
     *
     * @param value
     *            The integer to add
     */
    public void put64BitInteger(final BigInteger value) {
        final byte[] bytes = new byte[ULONG_LONG_LENGTH];
        int shift = (ULONG_LONG_LENGTH - 1) * 8;

        for (int i = 0; i < ULONG_LONG_LENGTH; i++, shift -= 8) {
            // $ANALYSIS-IGNORE,codereview.java.rules.casting.RuleCastingPrimitives
            bytes[i] = (byte) (value.shiftRight(shift).intValue() & 0xff);
        }
        writeBytes(bytes);
    }

    /**
     * Add the contents of an existing stream to the message
     *
     * @param stream
     *            The stream to add
     */
    public void putByteArrayOutputStream(final ByteArrayOutputStream stream) {
        putInteger(stream.size());

        try {
            stream.writeTo(message);
        } catch (final IOException e) {
            // Does not happen when copying between two ByteArrayOutputStreams; there's no IO
            assert false;
        }
    }

    public ByteBuffer getMessage() {
        // The extra 4 bytes is to account for the length of the length!
        final byte[] length = convertIntToBytes(message.size() + INTEGER_LENGTH);
        final byte[] payload = message.toByteArray();
        final ByteBuffer byteBuffer = ByteBuffer.allocate(length.length + payload.length);
        byteBuffer.put(length);
        byteBuffer.put(payload);
        byteBuffer.flip();

        System.out.println("byteBuffer: "+byteBuffer);
        return byteBuffer;
    }

    private void writeBytes(final byte[] bytes) {
        // Using this overload of write means we don't have to propagate IOExceptions
        message.write(bytes, 0, bytes.length);
    }
}
