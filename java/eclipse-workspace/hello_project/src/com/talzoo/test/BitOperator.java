package com.talzoo.test;

public class BitOperator {
	public static void main(String[] args) {
		int v1 = 10;
		System.out.println(v1 + "==>" + toBinaryString(v1));
		
		int v2 = ~v1; // ~: 비트반전연산자
		System.out.println(v2 + "==>" + toBinaryString(v2));
		
		int v3 = ~v1+1;
		System.out.println(v3+ "==>" + toBinaryString(v3));
		
		//System.out.println(Integer.MAX_VALUE);
		
		int v4 = 2147483647;
		System.out.println(v4 + "==>" + toBinaryString(v4));
		
		int v5 = v4+1; // overflow: integer 못쓰면 long type써야함
		System.out.println(v5 + "==>" + toBinaryString(v5));

		System.out.println("3 << 1: " + (3 << 1)); // bit shift: 고속의 연산
		System.out.println("3 << 2: " + (3 << 2));
		System.out.println("12 >> 1: " + (12 >>1));
		System.out.println("12 >> 2: " + (12 >> 2));
	
	} 
	public static String toBinaryString(int value) {
		String str = Integer.toBinaryString(value);
		while(str.length()<32) {
			str = '0' + str;
		}
		return str;
	}
}
