package com.talzoo.ex04;

public class Car {
    protected String model = "Sonata";
    protected String color = "gray";

    // 컴파일러가 기본생성자 만듦
    public void drive() {
        System.out.println("달린다.");
    }

    public void stop() {
        System.out.println("멈춘다");
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    
}
