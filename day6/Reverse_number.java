package com.BridgeLabz.day6;

public class Reverse_number {

	static void reverseNum(int num) {
		int reverse = 0;
		
		while(num!=0) {
			int rem = num%10; // 1 2 3 4 5 6
			 reverse = reverse*10+rem; // 123456
			num=num/10; // 65432 , 6543, 654,65, 6
		}
		System.out.println("Reverse Number is -"+reverse);
	}
	public static void main(String[] args) {
		reverseNum(654321);
	}
}
