package com.acadgild;

/**
 * 
 * Class to find the sum of aliquot divisors of a number
 *
 */
public class AliquotDivisorsSum {

	// Get the number as input
	int getAliquotDivisors(int num) {
		int i;
		int aliquotSum = 0;

		// Check for the divisor and if divisor then add it to the sum
		for (i = 1; i < num; i++) {
			if (num % i == 0) {
				aliquotSum = aliquotSum + i;

			}
		}
		return aliquotSum;
	}
}
