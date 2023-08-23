package com.talzoo.ex10;

public class GasolineEngine implements Engine{
    private String oil;
    private int numOfCylinder;

    

    public GasolineEngine(String oil, int numOfCylinder) {
        this.oil = oil;
        this.numOfCylinder = numOfCylinder;
    }
    

    @Override
    public void setOil() {
        // TODO Auto-generated method stub
        
    };


    @Override
    public void setOil_1(String a) {
        this.oil = a;
    }

    @Override
    public void setNumOfCylinder() {
        numOfCylinder = 5;
        
    }



    @Override
    public void showStatus() {
        System.out.println(numOfCylinder+" 기통");
        System.out.println(oil + " 기름");
        
    }



    @Override
    public void runEngine() {
        // TODO Auto-generated method stub
        System.out.println("가솔린: 드륵드륵~~~~");
    }
}
