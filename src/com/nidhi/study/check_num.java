package com.nidhi.study;

import java.util.Scanner;

public class check_num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s =new Scanner(System.in);

		System.out.print("Enter a number to check +/- :");
		int num= s.nextInt();
		if (num>0)
			System.out.print(num +" is Positive");
		else if (num<0)
			System.out.print(num +" is Negitive");
		else 
			System.out.print(" It is Zero");
		
	}

}
