package com.talzoo.test;

public class CastExam {
	public static void main(String[] args) {
		int a = 10;
		System.out.println(a);
		
		double b = a;
	
		System.out.println(b);
		
		System.out.println("------------------------");
		
		double c = 1.8;
		a = (int)c; // 작은 범위쪽으로는 autocasting이 안되기 때문에 강제캐스팅 해줘야 함
		
		System.out.println("a = " + a + ", c = " + c);
		
	}
}
