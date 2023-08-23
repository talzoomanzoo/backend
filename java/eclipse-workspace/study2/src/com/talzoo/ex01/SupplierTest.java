package com.talzoo.ex01;

import java.util.function.DoubleSupplier;
import java.util.function.IntSupplier;

public class SupplierTest {
    public static void main(String[] args) {
        IntSupplier intSupplier = () -> {
            int num = (int) (Math.random() * 6) + 1;
            return num;
        };

        int num = intSupplier.getAsInt();
        System.out.println("주사위 눈: " + num);
        System.out.println(intSupplier.getClass());

        //int a = 5;
        Integer b = 5;
        //System.out.println(a.getClass);
        System.out.println(b.getClass());


        DoubleSupplier doubleSupplier = new DoubleSupplier() {

            @Override
            public double getAsDouble() {
                // TODO Auto-generated method stub
                double num = Math.PI * 2;
                return num;
            }
            
        };

        double num2 = doubleSupplier.getAsDouble();
        System.out.println(num2);

        System.out.println(doubleSupplier.getClass());
    }
}
