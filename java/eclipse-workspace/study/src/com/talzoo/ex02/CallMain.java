package com.talzoo.ex02;

public class CallMain {
    public static void main(String[] args) {
        double result1 = 10 * 10 * Calculator.pi;
        int result2 = Calculator.plus(10,20);
        System.out.println(result1); // out: static field, 표준 print stream 객체를 heap에 만들어 놓음
        System.out.println(result2);
        System.out.println("=======================================");

        Calculator cal = new Calculator("cal01");
        int result3 = cal.minus(20, 10);
        cal.printName();
        System.out.println(result3);
        System.out.println("=======================================");

        Calculator cal2 = new Calculator("cal02");
        int result4 = cal2.minus(100, 50);
        cal2.printName();
        System.out.println(result4);
    }
}
