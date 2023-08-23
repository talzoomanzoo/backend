package com.talzoo.ex13Generic;

public class CarAgency implements Rentable<Car1> {
    @Override
    public Car1 rent() {
        return new Car1();
    }
}