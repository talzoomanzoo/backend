package com.talzoo.ex08;

public abstract class Engine {
    
    private int numOfCylinder;
    private String oil;

    public Engine(int numOfCylinder, String oil) { // Engine의 부모 클래스는 object: suoer();
        this.numOfCylinder = numOfCylinder;
        this.oil = oil;
    }

    public Engine() {
    }

    public void showStatus() {
        System.out.println(numOfCylinder + " 기통");
        System.out.println(oil + " 기름");
    }

    public abstract void runEngine(); // 추상메소드: 객체의 사용방법 규정

}
