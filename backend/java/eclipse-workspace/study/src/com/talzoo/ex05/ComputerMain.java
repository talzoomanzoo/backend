package com.talzoo.ex05;

public class ComputerMain {
    public static void main(String[] args) {
        int radius = 10;

        Calculator cal = new Calculator();
        System.out.println(cal.areaCircle(radius));

        System.out.println();

        Computer com = new Computer();
        System.out.println(com.areaCircle(radius)); // 메소드 오버라이팅할때 areaCircle != areacircle 조심


    }
}
