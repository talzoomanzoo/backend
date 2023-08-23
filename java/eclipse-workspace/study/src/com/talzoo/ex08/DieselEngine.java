package com.talzoo.ex08;

public class DieselEngine extends Engine{

    public DieselEngine(int numOfCylinder, String oil) {
        super(numOfCylinder, oil);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void runEngine() {
        // TODO Auto-generated method stub
        System.out.println("디젤: 부릉부릉~~~~~");
    }
    
}
