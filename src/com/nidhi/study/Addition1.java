package com.nidhi.study;

import java.util.Scanner;

/**
 * @author Lenovo
 *
 */
public class Addition1 {

	public static void main(String[] args) {
		
		Scanner s =new Scanner(System.in);
		
		System.out.println("Enter first No: ");
		int a=s.nextInt();
		
		System.out.println("Enter Second No: ");
		int b=s.nextInt();
		
		int c=a+b;
		
		System.out.println("Sum of a and b: "+c);
	}
}
