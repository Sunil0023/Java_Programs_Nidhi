package com.nidhi.study;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;

public class TestOutgoingMsg {
	
	public static void main(String[] args) throws Exception {
		
		OutgoingMessage msg=new OutgoingMessage();
		
		msg.putInteger(1000);
		msg.putInteger(20);
		msg.putString("Sunil");
		msg.putInteger(28);
		msg.putString("Sanu");
		
		System.out.println(msg.getMessage().array());
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss SSS");
		LocalDateTime now = LocalDateTime.now();
		System.out.println(dtf.format(now)); //2016/11/16 12:08:43
		Thread.sleep(2000);
		LocalDateTime now1 = LocalDateTime.now();
		System.out.println(dtf.format(now1)); //2016/11/16 12:08:43
		//System.out.println(System.currentTimeMillis());
		
//		System.out.println(100 >> 0);
	}

}
