package com.talzoo.test;

public class PrimitiveData {
	public static void main(String[] args) {
		char ch1 = 'A';
		char ch2 = 65; // 동일
		char ch3 = '\u0041'; //동일 (유니코드)
		
		char ch4 = '가';
		char ch5 = 44032;
		char ch6 = '\uac00';
		
		System.out.println(ch1);
		System.out.println(ch2);
		System.out.println(ch3);
		System.out.println(ch4);
		System.out.println(ch5);
		System.out.println(ch6); // ctrl + D 삭제
		
		int num  = 10;
		int result = num + 10;
		
		double d = 12.345;
		//float f = 2.345f;
		
		System.out.println("result =" + result);
		System.out.println(d);
		
		//String myString = "Java class";
		//String myString2 = "J";
				
	}
} //ctrl f11 실행
