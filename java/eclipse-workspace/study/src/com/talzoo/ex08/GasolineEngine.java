package com.talzoo.ex08;

public class GasolineEngine extends Engine{

    public GasolineEngine(int numOfCylinder, String oil) {
        super(numOfCylinder, oil);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void runEngine() {
        // TODO Auto-generated method stub
        System.out.println("가솔린: 드륵드륵~~~~~");
    }
    
}
