package com.nidhi.study;

import java.util.Scanner;

public class TriangleStars {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the rows to print star: ");
		int row=sc.nextInt();

		System.out.println("==========Find the Stars below=====================\n");

		for(int i=1;i<row;i++) {

			for(int j=1;j<row-i;j++) {
				System.out.print(" ");
			}

			for(int k=1;k<=i;k++) {
				System.out.print("* ");//add space next to * for printing pyramid
			}
			System.out.println();
		}
	}
}
