package com.BridgeLabz.day6;

public class Coupon_number {

	public static void main(String[] args) {

		char[] chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz123456789".toCharArray();
		int Max = 100000000;

		int random = (int) (Math.random() * Max);
		StringBuffer sb = new StringBuffer();

		while (random > 0) {

			sb.append(chars[random % chars.length]);
			random /= chars.length;

		}
		String CouponCode = sb.toString();
		System.out.println("Coupon Code : " + CouponCode);
	}
}
