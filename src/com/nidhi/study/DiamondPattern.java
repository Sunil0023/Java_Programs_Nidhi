package com.nidhi.study;

//Java program to print diamond Number pattern 
import java.util.Scanner; 

//Main Logic
class DiamondPattern { 
	void displayPattern(int n) 
	{

		int space = n / 2, number = 1,l=1;//l to count line no 

		// Outer for loop for number of lines 
		for (int i = 1; i <= n; i++) { 

			// Inner for loop for printing spaces 
			for (int j = 1; j <= space; j++) 
				System.out.print(" "); 

			// Inner for loop for printing numbers 
			int count = number / 2 + 1;

			for (int k = 1; k <= l; k++) { 
				System.out.print(count); 

				if(i%2==0) {
					System.out.print(" ");
					count++;
				}else {
					System.out.print(" ");
					count++;
				}
			} 

			// To goto next line
			System.out.println(); 
			if (i <= n / 2) { 
				space = space - 1;// space decreased by 1 
				number = number + 2;// number increased by 2  
				l++;
			} 

			else { 
				space = space + 1;// space increased by 1 
				number = number - 2;// number decreased by 2 
				l--;
			} 
		} 
	} 

	// Driver code 
	public static void main(String[] args) 
	{ 
		DiamondPattern p = new DiamondPattern(); 
		Scanner sc = new Scanner(System.in); 
		System.out.println("Enter the number of rows to print: ");
		int n=sc.nextInt();
		System.out.println("*****************************************");
		System.out.println("***********Find The Pattern**************");
		p.displayPattern(n); 
	} 
} 
