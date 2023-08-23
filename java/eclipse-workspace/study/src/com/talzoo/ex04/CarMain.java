package com.talzoo.ex04;

public class CarMain {
    public static void main(String[] args) {
        Convertible camaro = new Convertible("쉐보레카마로", "black");

        System.out.println(camaro.getModel());
        System.out.println(camaro.getColor());
        
        camaro.drive();
        camaro.stop();
        camaro.openRoof();
        camaro.closeRoof();
    }
}
