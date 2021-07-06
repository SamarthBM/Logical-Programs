/****************************************************************
 * Purpose : To check whether entered number is prime or not.
 * @author Samarth BM

***************************************************************/

package com.bridgelabs;

import java.util.Scanner;

public class PrimeNumber {
	
	// Method to check for prime number.
	public static void primeCheck(int x) {
		for(int i=2; i<=x/2;) {
			if(x%i==0) {
				System.out.println(x + " is not a prime number");
				break;
			}else {
				System.out.println(x + " is a prime number");
				break;
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// Taking user input.
		System.out.println("Enter number to check prime or not: ");
		int num = sc.nextInt();
		
		primeCheck(num);
		sc.close();

	}

}

