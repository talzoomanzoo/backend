package com.talzoo.ex01;

public class Calculator {
    public double areaRectangle(double width) {
        return width * width;
    }

    public double areaRectangle(double width, double height) {
        return width * height; // method overloading (double 1 vs double 2)
    }

    /* public int areaRectangle(double width, double height) {
        return (int) (width * height); // double vs int이지만 compiler가 중복되었다고 판단함
    }  */ // method signature: 접근제한자 + 리턴타입 + 메서드이름 -> 리턴타입은 체크안함 (메서드 내 파라미터 타입만 상관함)
}
