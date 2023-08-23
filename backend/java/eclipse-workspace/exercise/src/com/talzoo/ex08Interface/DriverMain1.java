package com.talzoo.ex08Interface;

public class DriverMain1 {
    public static void checkVehicle(Vehicle1 vehicle) {
            if (vehicle instanceof Bus1) {
                Bus1 bus = (Bus1) vehicle;
                bus.checkFare();
            }
            
            vehicle.run();
        }
    public static void main(String[] args) {
        Driver1 driver = new Driver1();
        
        Vehicle1 bus = new Bus1();
        Vehicle1 taxi = new Taxi1();

        driver.drive(bus);
        driver.drive(taxi);

        checkVehicle(bus);
        checkVehicle(taxi);
    }
}
