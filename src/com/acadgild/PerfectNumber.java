package com.acadgild;

/**
 * 
 * Class to determine if a given number is perfect number or not
 *
 */
public class PerfectNumber extends AliquotDivisorsSum {
	int divisorsSum;
	boolean isPerfectNumber;

	// Accept the number as input
	boolean checkPerfectNumber(int num) {
		isPerfectNumber = false;

		// Get the aliquot sum of the number
		divisorsSum = super.getAliquotDivisors(num);

		// Check if the number is equal to its aliquot sum
		if (divisorsSum == num) {
			isPerfectNumber = true;
		}
		return isPerfectNumber;
	}
}
