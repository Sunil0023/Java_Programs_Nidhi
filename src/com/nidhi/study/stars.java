package com.nidhi.study;

import java.util.Scanner;

public class stars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//		Scanner s= new Scanner(System.in);
		//
		//		System.out.print("Enter no. of rows: ");
		//		int rows= s.nextInt();
		//		System.out.print("Enter no. of columns: ");
		//		int colomn= s.nextInt();

		//		for (int i=rows;i>=1;i--) {
		//			for (int j=colomn;j>=1;j--)
		//				if(i<=j) System.out.print(" ");
		//			System.out.println("*");
		//		}
		
		for(int j=1;j>=5;j++) {
			for(int i=5;i>=1;i--) {
				System.out.print("*");
			}
		}
	}
}
