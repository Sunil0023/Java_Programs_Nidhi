package com.nidhi.study;

import java.util.Scanner;

public class sum_even {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s =new Scanner(System.in);

		System.out.print("Enter a number range to print sum of even no.");
		int num= s.nextInt();
		int sum=0;
		for (int i = 2; i <= 2*num; i= i+2)
			sum = sum+i;
		System.out.print( " sum = "+ sum);

	}

}
