package com.nidhi.study;

/*
 * Java Programs to copy Contents from one File to another.
 * 1. Create File as per user Input and write contents in the input file.
 * 2. Create Output file and copy the contents of input file to output file. 
 * @Aunthor: Nidhi Yadav
 */

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
 
public class FileCopy 
{
    public static void main(String[] args)
    {	
    	FileInputStream instream = null;
    	FileOutputStream outstream = null;
    	boolean flag=false;
 
    	try{
    		//Scanner Class for User Input
    	    Scanner sc=new Scanner(System.in);

    	    //Input File
    	    System.out.println("Provide the File Name:");
    	    String fileName=sc.nextLine();
    	    File inPutFile=new File("C:\\Sunil Data\\"+fileName+".txt");
    	    boolean inputfileCreated=inPutFile.createNewFile();
    	    //Check if input file created
    	    if(inputfileCreated) {
    	    	System.out.println("File Created with Name: "+fileName+".txt");
    	    }else {
    	    	System.out.println("OhhO File not created!! File Might already exist. Please try another file.");
    	    }
    	    
    	    //Write contents into input file
    	    System.out.println("Enter the contents to write in Input File:");
    	    String str=sc.nextLine();

    	    FileWriter fw=new FileWriter(inPutFile);   
            fw.write(str);
            fw.close();
            System.out.println("Contents written in Input File");
            
            //Create Output File
    	    File outPutFile =new File("C:\\Sunil Data\\"+fileName+"_"+"Output.txt");
    	    boolean outfileCreated=outPutFile.createNewFile();
    	    //Check if Outfile created
    	    if(outfileCreated) {
    	    	System.out.println("Output File Created with Name: "+outPutFile);
    	    }else {
    	    	System.out.println("OhhO File not created! Please try again.");
    	    }
    	    
    	    //Input/Output Stream to copy file Input->Output file
    	    instream = new FileInputStream(inPutFile);
    	    outstream = new FileOutputStream(outPutFile);
 
    	    byte[] buffer = new byte[1024];
 
    	    int length;
    	    /*Copying the input File contents from Input Stream to
    	     * Output Stream using read and write methods
    	     */
    	    while ((length = instream.read(buffer)) > 0){
    	    	System.out.println("Inside copy file");
    	    	outstream.write(buffer, 0, length);
    	    	flag=true;
    	    }

    	    //Closing the input/output file streams
    	    instream.close();
    	    outstream.close();
    	    if(flag) {
    	    System.out.println("File copied successfully!!");
    	    }else {
    	    	System.out.println("File NOT Copied!!!");
    	    }
    	    
    	}catch(IOException ioe){
    		ioe.printStackTrace();
    	 }
    }
}