package com.talzoo.ex08Interface;

public class CarMain {
    public static void main(String[] args) {
        Car car = new Car();
        car.tire = new HankookTire();
        car.drive();

        /* car.tire = null;
        car.drive(); */ // NullPointerException

        car.tire = new KumhoTire();
        car.drive();
    }
}
