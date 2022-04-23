package com.nidhi.study;

import java.util.Scanner;

public class Array_Stub {

	public static void main(String[] args) {

		int n, equal_No = 0, greater_No = 0, less_No = 0, sum = 0;
		Scanner s = new Scanner(System.in);

		int a[] = new int[10];

		System.out.println("Enter 10 elements:");

		for (int i = 0; i < 10; i++) {
			a[i] = s.nextInt();

			sum = sum + a[i];
		}

		// Entered Nos from User
		System.out.println("Entered numbers are: ");
		for (int num : a) {
			System.out.print(num + " ");
		}

		System.out.println("\nEnter no. to check from Array:");
		n = s.nextInt();

		System.out.println("Entered Number is: " + n);

		// Check Equal, Greater, Less no wrt. user input no.
		for (int check : a) {
			if (check == n)
				equal_No++;
			else if (check > n)
				greater_No++;
			else
				less_No++;
		}

		System.out.println("Equal No: " + equal_No + " ,Greater No.: " + greater_No + " ,lessNo: " + less_No);

		System.out.println("Sum of Numbers: " + sum);
	}
}
