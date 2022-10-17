package com.BridgeLabz.day6;

public class FibonacciSeries {
      
	static void checkFibonacciSeries(int num) {
		int c , a = 0;
		int b = 1;
		
		for(int index=1; index<=num; index++) {
			
			c= a + b;
			a=b;
			b=c;
			System.out.println(c+" ");
		}
				
	}
	public static void main(String[] args) {
		checkFibonacciSeries(5);
	}
}
