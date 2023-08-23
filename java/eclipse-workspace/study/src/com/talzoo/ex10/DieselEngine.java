package com.talzoo.ex10;

public class DieselEngine implements Engine{
    private String oil;
    private int numOfCylinder; // 필드

    
    /* public DieselEngine(String oil, int numOfCylinder) {
        this.oil = oil;
        this.numOfCylinder = numOfCylinder;
    } */ // 기본 빈 생성자 없어져서 매개변수를 넣어줘야 함.

    @Override
    public void setOil() {
        oil = "diesel";
        
    }

    @Override
    public void setNumOfCylinder() {
        numOfCylinder = 4;
        
    }


    @Override
    public void showStatus() {
        System.out.println(numOfCylinder+" 기통");
        System.out.println(oil + " 기름");
        
    }



    @Override
    public void runEngine() {
        // TODO Auto-generated method stub
        System.out.println("디젤: 부릉부릉~~~~~");
    }

    public void setOil(String oil) {
        this.oil = oil;
    }

    public void setNumOfCylinder(int numOfCylinder) {
        this.numOfCylinder = numOfCylinder;
    }
    
}
