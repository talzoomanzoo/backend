package com.talzoo.ex08Interface;

public class VehicleMain {
    public static void main(String[] args) {
        Vehicle vehicle = new Bus();

        vehicle.run();
        // vehicle.checkFare(); method checkFare() is undefined for the variable vehicle

        Bus bus = (Bus) vehicle;

        bus.run();
        bus.checkFare();
    }
}
