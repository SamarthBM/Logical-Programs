/****************************************************************
 * Purpose : To reverse the entered number.
 * @author Samarth BM

***************************************************************/

package com.bridgelabs;

import java.util.Scanner;

public class ReverseNumber {
	
	// Method to reverse a number.
	public static void performReverseNumber(int x) {
		
		int rem;
		int rev = 0;
		
		while(x != 0) {
			rem = x % 10;
			rev = rev * 10 + rem;
			x = x / 10;
		}
		System.out.println("Entered number is now reversed to " + rev);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// User input.
		System.out.println("Enter a number to reverse it: ");
		int num = sc.nextInt();
		
		performReverseNumber(num);
		sc.close();

	}

}

