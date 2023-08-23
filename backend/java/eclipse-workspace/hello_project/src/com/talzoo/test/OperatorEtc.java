package com.talzoo.test;

public class OperatorEtc {
    public static void main(String[] args) {
        int a = 10;
        int b = 4; //python에서는 2.5, java는 정수/정수라서 2
        System.out.println(a / b);
        System.out.println(a / 4);
        System.out.println(a / 4.); //int와 double의 차이
        System.out.println(a / (double) b);

        String s1 = "Java"; //heap 의 constant string pool
        String s2 = "Java"; // heap의 constant string pool (프로그램이 종료되어야 사라짐)
        String s3 = new String("Java"); // new: 새로운 객체 생성, heap 의 X constant string pool (레퍼런스가 없으면 사라짐)
        //s1 = s3; //레퍼런스를 constant string pool에서 밖으로
        
        System.out.println("s1 == s2 " + (s1 == s2)); // 문자열과 숫자, 불린은 concatenation됨, 파이썬은 안됨  / 연산자 여러개 나오면 뭐부터 할지 순서 정해줘야함
        System.out.println(s2 == s3);
        System.out.println(s1 == s3); //레퍼런스 비교
        System.out.println(s1.equals(s3)); // 값비교
    }
}
