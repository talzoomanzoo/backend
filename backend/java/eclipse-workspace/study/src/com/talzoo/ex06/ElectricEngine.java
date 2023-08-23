package com.talzoo.ex06;

public class ElectricEngine extends Engine{

    public ElectricEngine(int numOfCylinder, String oil) {
        super(numOfCylinder, oil);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void runEngine() {
        // TODO Auto-generated method stub
        System.out.println("전기차 부릉~~~~~");
    }
    
    
}
