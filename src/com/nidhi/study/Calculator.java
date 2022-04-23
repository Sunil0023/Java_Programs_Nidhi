package com.nidhi.study;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {

		
		Scanner s =new Scanner(System.in);
		
		System.out.println("Enter first No: ");
		int a=s.nextInt();
		
		System.out.println("Enter Second No: ");
		int b=s.nextInt();
		
		
		int c=a+b;
		int d=a-b;
		int e=a*b;
		int f=a/b;
		int g=a%b;
		System.out.println("a: "+a);
		System.out.println("b: "+b);
		System.out.println("Sum of a and b: "+c);
		System.out.println("Diffrence of a and b: "+d);
		System.out.println("Multiplication of a and b: "+e);
		System.out.println("Division of a to b: "+f);
		System.out.println("Remainder of a to b: "+g);
		System.out.println("Increment of a : "+ (++a));
		System.out.println("Decrement of a : "+ (--a));	
	}
	
}
