package com.talzoo.ex13Generic;

public class RentableMain {
    public static void main(String[] args) {
        CarAgency carAgency = new CarAgency();
        Car1 car = carAgency.rent();
        car.run();

        HomeAgency homeAgency = new HomeAgency();
        Home1 home = homeAgency.rent();
        home.turnOnLight();
    }
}
