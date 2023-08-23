package com.talzoo.ex06;

public class CarMain {
    public static void main(String[] args) {
        Engine gaEngine = new GasolineEngine(4, "gasoline");
        Engine diEngine = new DieselEngine(4, "diesel");
        Engine elecEngine = new ElectricEngine(4, "electric");

        Car sonata = new Car(gaEngine);
        Car santafe = new Car(diEngine);
        Car sonata_hybrid = new Car(elecEngine);


        Car sonata_1 = new Car(new GasolineEngine(0, null));
        Car santafe_1 = new Car(new DieselEngine(0, null));
        Car sonata_hybrid_1 = new Car(new ElectricEngine(0, null)); // stack 메모리 좀 가벼워짐

        gaEngine = null; // 바꾸고 싶으면 getter setter로 바꾸면 됨
        diEngine = null;

        sonata.drive();
        santafe.drive();
        sonata_hybrid.drive();

        System.out.println("=======================");
        
        gaEngine.showStatus();
        diEngine.showStatus();
        elecEngine.showStatus();

        System.out.println("=======================");

        gaEngine.runEngine();
        diEngine.runEngine();
        elecEngine.showStatus();

    }
}
