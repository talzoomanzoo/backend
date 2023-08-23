package com.talzoo.ex10;

public class CarMain {
    public static void main(String[] args) {
        
        // Engine diEngine = new DieselEngine(4, "diesel");
        Engine diEngine = new Engine() {
            private int numOfCylinder;
            private String oil;

            @Override
            public void runEngine() {
                // TODO Auto-generated method stub
                System.out.println("디젤: 부릉부릉~~~~");
            }

            @Override
            public void setOil() {
                // TODO Auto-generated method stub
                oil = "diesel";
            }

            

            @Override
            public void showStatus() {
                // TODO Auto-generated method stub
                System.out.println(numOfCylinder + " 기통");
                System.out.println(oil + " 기름");
            }

            @Override
            public void setNumOfCylinder() {
                // TODO Auto-generated method stub
                numOfCylinder = 5;
            }

        }; // 익명 객체 생성

        Engine gaEngine = new GasolineEngine("gasoline", 5);
        Engine elEngine = new ElectricEngine();

        elEngine.showStatus();
        gaEngine.showStatus();
        System.out.println("===========================");
        gaEngine.setOil_1("new gasoline"); // setter로 변경
        gaEngine.showStatus();

        Car dieselCar = new Car(diEngine);
        Car gasCar = new Car(gaEngine);
        Car elCar = new Car(elEngine);
        Car dieselCar2 = new Car(new Engine() {

            private int numOfCylinder;
            private String oil;

            @Override
            public void runEngine() {
                // TODO Auto-generated method stub
                System.out.println("디젤: 부릉부릉~~~~");
            }

            @Override
            public void setOil() {
                // TODO Auto-generated method stub
                oil = "gasoline";
            }

            @Override
            public void setNumOfCylinder() {
                // TODO Auto-generated method stub
                numOfCylinder = 5;
            }

            @Override
            public void showStatus() {
                // TODO Auto-generated method stub
                System.out.println(numOfCylinder + " 기통");
                System.out.println(oil + " 기름");
            }
            

        }); // 익명 객체 생성 // 필드에도 익명객체 가능

        dieselCar.drive();
        gasCar.drive();
        dieselCar2.drive();
        elCar.drive();
        dieselCar.carspec();
        gasCar.carspec();
        dieselCar2.carspec();
        elCar.carspec();

        System.out.println(" ==============================");

        engineRunengine(dieselCar);
        engineRunengine(gasCar);
        engineRunengine(elCar);

        System.out.println(" ==============================");
        
        Car dieselCar3 = new Car(new DieselEngine());
        //Car gasCar2 = new Car(new GasolineEngine());

        engineRunengine(dieselCar3);
        //engineRunengine(gasCar2);
    }

    public static void engineRunengine(Car car) {
        car.drive();
    }
}
