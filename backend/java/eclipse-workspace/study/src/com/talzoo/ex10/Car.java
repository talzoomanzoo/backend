package com.talzoo.ex10;

public class Car {
    private Engine engine;

    public Car(Engine engine) {
        this.engine = engine;
    }

    public void drive() {
        engine.runEngine();
    }

    public void carspec() {
        engine.setNumOfCylinder();
        engine.setOil();
        engine.showStatus();
    }
}
