
package com.nidhi.study;

import java.util.Scanner;

public class Student_Result {

	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		
		System.out.println("Enter Marks in English: ");
		int eng=s.nextInt();
		System.out.println("Enter Marks in Math: ");
		int math=s.nextInt();
		System.out.println("Enter Marks in History: ");
		int his=s.nextInt();
		System.out.println("Enter Marks in Physics: ");
		int phy=s.nextInt();
		System.out.println("Enter Marks in Hindi: ");
		int hin=s.nextInt();
		
		int sum = eng+math+his+phy+hin ;
		System.out.println("Sum of Marks in all Subjects: "+sum);
		int per= sum/5;
		System.out.println("Percentage of the student =" +per+"%");
		System.out.println("Grade of the student =");
		
		if (per>85)
			System.out.println("A");
		else if (per>75 && per<=85)
			System.out.println("B");
		else if (per>55 && per<=75)
			System.out.println("C");
		else System.out.println("D");


	}
}
