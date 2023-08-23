package com.talzoo.ex06;

public class Car {
    private Engine engine; // 객체 내부에 있음 // heap 에서 diEngine, gaEngine 객체 가리킴

    public Car(Engine engine) { // engine에 GaEngine, DiEngine 가능 <- 생성자 polymorphism
        this.engine = engine;
    }

    public void drive() {
        engine.runEngine();
    }
}
