package com.talzoo.ex09Anonymous;

public class CarMain {
    public static void main(String[] args) {
        Car car = new Car();

        car.run();

        car.run2();

        car.run3(new Tire() {
            @Override
            void roll() {
                System.out.println("한국타이어가 회전합니다.");
                System.out.println("금호타이어가 회전합니다.");
            }
        });
    }
}
