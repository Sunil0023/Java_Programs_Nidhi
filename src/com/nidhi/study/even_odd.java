package com.nidhi.study;

import java.util.Scanner;

public class even_odd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s =new Scanner(System.in);

		System.out.print("Enter a number to check even odd :");
		int num= s.nextInt();
		if ((num %2) ==0)
			System.out.print(num + " is Even number");
		else System.out.println(num +" is odd number");
		
	}

}
