package com.nidhi.study;

import java.util.Scanner;

public class fabonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s =new Scanner(System.in);

		System.out.print("Enter a range of fabonacci series :");
		int num= s.nextInt();
		System.out.print("0"+" ");
		System.out.print("1"+" ");
	
		
		int f1=0;
		int f2=1;
		for (int i = 1; i < num; i++) {
			int f3=f1+f2;
			System.out.print(f3+" ");
			f1=f2;
			f2=f3;
			
		}
	}

}
