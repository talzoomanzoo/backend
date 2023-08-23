package com.talzoo.ex03;

public class CarMain {
    public static void main(String[] args) {
        Car car = new Car();

        car.setSpeed(-50);
        System.out.println("속도: " + car.getSpeed());

        car.setSpeed(100);
        
        if (!car.isStop()) {
            car.setStop(true);
        }
        
        System.out.println("속도: " + car.getSpeed());
    }
}
