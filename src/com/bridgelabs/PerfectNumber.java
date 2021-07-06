/****************************************************************
 * Purpose : To check whether entered number is perfect or not.
 * @author Samarth BM

***************************************************************/

package com.bridgelabs;

import java.util.Scanner;

public class PerfectNumber {

	// Boolean method to check for a perfect number.
	public static boolean checkPerfectNumber(int x) {
		int sum = 0;

		// Getting the factors of entered number and adding them.
		for (int i = 1; i < x; i++) {
			if (x % i == 0) {
				sum += i;
			}
		}

		// To check for a perfect number
		if (x == sum) {
			System.out.println("It is a perfect number");
			return true;
		} else {
			System.out.println("Its not a perfect number");
			return false;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// User input
		System.out.println("Enter a number to check whether it is perfect no. or not");
		int num = sc.nextInt();

		checkPerfectNumber(num);
		sc.close();
	}

}
