package com.talzoo.ex15;

public class User02 extends Thread {
    private Calculator calculator;

    public void setCalculator(Calculator calculator) {
        this.calculator = calculator;
        this.setName("User02");
    }

    @Override
    public void run() {
        // TODO Auto-generated method stub
        calculator.setMemory(50);
    }
}
