package com.talzoo.ex02;

public class Calculator {
    public static double pi = 3.1415192; // static field (인스턴스 만들기 전에 사용가능)
    String name;

    public Calculator(String name) {
        this.name = name;
    }
    public static int plus(int x, int y) {
        return x + y;
    }  // static method (인스턴스 만들기 전에 사용가능)

    public int minus(int x, int y) {
        return x - y;
    } // instance method (객체를 만들어야만 접근이 가능함)

    public void printName() {
        System.out.println("name");
    } // instance method (객체를 만들어야만 접근이 가능함)
}

// JVM이 시작되면
    //1. 실행코드 (class loader 사용하여 class들을) methods영역 (static 영역)에 올림
    //2. static field 들도 올림
    //heap은 reference하는 게 없으면 사라짐, static은 프로그램 종료시 사라짐