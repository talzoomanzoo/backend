package com.talzoo.ex01;

import java.util.function.IntBinaryOperator;

class OperationTest {

    private static int[] scores = {94, 96, 86};
	
	public static int maxOrMin(IntBinaryOperator operator) {
		int result = scores[0];
		for(int score: scores) {
			result = operator.applyAsInt(result,  score); // two integer type param
		}
		return result; // return int
	}
	
	public static void main(String[] args) {
		int max = maxOrMin(
				(a, b) -> a >= b ? a: b
                );
		
		System.out.println("최대값: " + max);
		
		int min = maxOrMin(
				(a, b) -> {
					if( a <= b)
						return a;
					else
						return b;
				}
		);
		
		System.out.println("최소값: " + min);
			
	}
}