package com.talzoo.ex07Inheritance;

public class TireMain {
    public static void main(String[] args) {
        Car car = new Car();
       // car.run(); NullPointerException: Cannot invoke "com.talzoo.ex07Inheritance.Tire.roll()" because "this.tire" is null

        car.tire = new Tire();
        // car.tire = null; NullPointerException: Cannot invoke "com.talzoo.ex07Inheritance.Tire.roll()" because "this.tire" is null
        car.run();

        car.tire = new HankookTire();
        car.run();

        car.tire = new KumhoTire();
        car.run();
    }
}
