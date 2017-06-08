package com.acadgild;

/**
 * 
 * Main Class to print the Perfect numbers between 1 and 100
 *
 */
public class PerfectNumberDemo {

	public static void main(String[] args) {
		int i;
		// TODO Auto-generated method stub
		PerfectNumber al = new PerfectNumber();
		System.out.println("List of Perfect Numbers between 1 and 100::");
		for (i = 1; i <= 100; i++) {
			// Check if the number is perfect number
			if (al.checkPerfectNumber(i)) {
				System.out.println(i);
			}

		}

	}

}
