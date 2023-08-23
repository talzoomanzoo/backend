package com.talzoo.ex04;

public class Convertible extends Car{
    public Convertible(String model, String color) { 
        // compiler가 super()로 부모의 기본생성자를 자동으로 호출
        // super(); // 자식 생성자의 첫 line에는 부모 생성자를 반드시 넣어야 하지만 생략 가능한 case도 있음
        this.model = model;
        this.color = color;
    }

    public void openRoof() {
        System.out.println("뚜껑 연다");
    }

    public void closeRoof() {
        System.out.println("뚜껑 닫는다");
    }
}
