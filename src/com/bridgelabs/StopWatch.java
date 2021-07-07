/****************************************************************
 * Purpose : To simulate a stop watch program
 * @author Samarth BM

***************************************************************/

package com.bridgelabs;

import java.util.Scanner;

public class StopWatch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// starting the timer
		System.out.println("Enter 1 to start the clock");
		double start = sc.nextDouble();
		start = System.currentTimeMillis();

		// stopping the timer
		System.out.println("Enter 0 to stop the clock");
		double stop = sc.nextDouble();
		stop = System.currentTimeMillis();

		// Converting to seconds and displaying.
		double elapsed_time = (stop - start) / 1000;
		System.out.println("Elapsed time is " + elapsed_time + "seconds");
		sc.close();

	}

}
