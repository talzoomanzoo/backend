package com.talzoo.control;

public class ArrayTest {
    public static void main(String[] args) {
        // int[] scores = new int[] {80, 80, 100}; 원래는 이렇게 heap에 새로운 객체 만드는 것임
        int[] scores = {80,90,100}; // 이렇게 써도 자동 변환 가능
        System.out.println(scores.length);
        System.out.println(scores[0]);
        System.out.println(scores[1]);
        System.out.println(scores[2]);

        int sum = 0;
        for (int i = 0; i < scores.length; i++) {
            sum += scores[i];
        }
        System.out.println(sum);

        sum = 0;
        for (int score: scores) { // in 대신 :, 뒤에는 collection 데이터타입이 옴
            sum += score;
        }
        System.out.println(sum);
    }
}
