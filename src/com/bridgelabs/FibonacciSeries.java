/****************************************************************
 * Purpose : To compute fibonacci series till N.
 * @author Samarth BM

***************************************************************/

package com.bridgelabs;

import java.util.Scanner;

public class FibonacciSeries {

	// Method to perform fibonacci series.
	public static void performFibonacci(int a) {
		int x = 0;
		int y = 1;
		int result;

		System.out.println(x);
		System.out.println(y);

		for (int i = 1; i <= a - 2; i++) {
			result = x + y;
			x = y;
			y = result;
			System.out.println(result);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Taking user input for value of N.
		System.out.println("Enter value of N: ");
		int N = sc.nextInt();

		performFibonacci(N);
		sc.close();

	}

}
