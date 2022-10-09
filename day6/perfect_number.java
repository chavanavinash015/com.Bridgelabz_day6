package com.BridgeLabz.day6;

public class perfect_number {

	static void checkPerfectNum(int num) {
		int sum = 0;
		
 		for (int index = 1; index < num; index++) {
              if (num % index == 0) {
				sum = sum + index;    //1  2  3  7 14 28
			}
            
		}
		if (num == sum) {
			System.out.println("Perfect Number");
		}else 
			System.out.println("Not Perfect Number");
	}	
	public static void main(String[] args) {
		checkPerfectNum(28);
	}
}
