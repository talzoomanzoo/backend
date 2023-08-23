package com.talzoo.ex06;

public class Engine {
    private int numOfCylinder;
    private String oil;

    public Engine(int numOfCylinder, String oil) { // Engine의 부모 클래스는 object: suoer();
        this.numOfCylinder = numOfCylinder;
        this.oil = oil;
    }

    public void showStatus() {
        System.out.println(numOfCylinder +" 기통");
        System.out.println(oil + " 엔진");
    }

    public void runEngine() {
        System.out.println("엔진 가동!");
    }

}
