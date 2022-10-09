package com.BridgeLabz.day6;

public class Prime_number {

	static void checkPrimeNum(int num) {
		int Count = 0;
		
        boolean isPrime = true;
		for (int index = 1; index <= num; index++) {
			if (num % index == 0) {
                 Count++;
			}
		}
		if (Count == 2)
			System.out.println("Prime Number");
		else
			System.out.println("Not Prime Number");

	}

	public static void main(String[] args) {
		checkPrimeNum(17);
	}
}
