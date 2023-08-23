package com.talzoo.ex15;

public class User01 extends Thread{
    private Calculator calculator;

    public void setCalculator(Calculator calculator) {
        this.calculator = calculator;
        this.setName("User01");
    }

    @Override
    public void run() {
        // TODO Auto-generated method stub
        calculator.setMemory(100);
    }

}
