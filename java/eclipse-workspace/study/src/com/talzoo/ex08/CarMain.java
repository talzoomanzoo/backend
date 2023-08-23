package com.talzoo.ex08;

public class CarMain {
    public static void main(String[] args) {
        
        // Engine diEngine = new DieselEngine(4, "diesel");
        Engine diEngine = new Engine() {

            @Override
            public void runEngine() {
                // TODO Auto-generated method stub
                System.out.println("디젤: 부릉부릉~~~~");
            }

        }; // 익명 객체 생성
        Engine gaEngine = new GasolineEngine(4, "gasoline");

        Car sonata = new Car(diEngine);
        Car volvo = new Car(gaEngine);
        Car santafe = new Car(new Engine() {
            @Override
            public void runEngine() {
                // TODO Auto-generated method stub
                System.out.println("디젤: 부릉부릉~~~~");
            }

        }); // 익명 객체 생성 // 필드에도 익명객체 가능

        sonata.drive();
        volvo.drive();
        santafe.drive();

        System.out.println(" ==============================");

        engineRunengine(sonata);
        engineRunengine(volvo);

        System.out.println(" ==============================");
        
        Car sonata_1 = new Car(new DieselEngine(5, "diesel"));
        Car santafe_1 = new Car(new GasolineEngine(5, "gasoline"));

        engineRunengine(sonata_1);
        engineRunengine(santafe_1);
    }

    public static void engineRunengine(Car car) {
        car.drive();
    }
}
