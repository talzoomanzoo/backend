package com.talzoo.ex13Generic;

public class ProductMain {
    public static void main(String[] args) {
        Product<Tv, String> product1 = new Product<Tv, String>();
        product1.setKind(new Tv());
        product1.setModel("SamsungTV");

        Product<Car, String> product2 = new Product<>();
        product2.setKind(new Car());
        product2.setModel("Porsche");

        // product1.getKind(); // 가져오기만 하고 print X (getter는 return 값이 있는 함수이기 때문)
        System.out.println(product1.getKind()); // 객체식별자가 나옴
        System.out.println(product1.getModel()); // SamsungTV

        System.out.println(product2.getKind()); // 객체식별자가 나옴
        System.out.println( product2.getModel()); // SamsungTV
    }
}
