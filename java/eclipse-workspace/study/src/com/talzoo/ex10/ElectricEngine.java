package com.talzoo.ex10;

public class ElectricEngine implements Engine{
    private int numOfCylinder;
    private String oil;
    
    @Override
    public void runEngine() {
        System.out.println("전기: 슈웅~~~~");
    }
    @Override
    public void setNumOfCylinder() {
        this.numOfCylinder = 5;
        
    }
    @Override
    public void setOil() {
        this.oil = "electric";
        
    }
    @Override
    public void showStatus() {
        // TODO Auto-generated method stub
        System.out.println(numOfCylinder + " 기통");
        System.out.println(oil + " 기름");
    }
    
}
