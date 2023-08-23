package com.talzoo.ex07Inheritance;

public class Phone {
    // 필드 선언
    public String model;
    public String color;

    // 부모 생성자 선언
    public Phone(String model, String color) {
        this.model = model;
        this.color = color;
        System.out.println("Phone() 부모 생성자 실행," + this.model + " 모델" + this.color + " 색상");
    }
}
