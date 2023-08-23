package com.talzoo.ex17;

public class PairMain {
    public static void main(String[] args) {
        Pair<Integer, String> p1 = new Pair<Integer, String>(1, "Java"); // Integer class equals는 override 되어서 레퍼런스가 가지고 있는 primitive data type 값을 비교하도록 된다.
        Pair<Integer, String> p2 = new Pair<Integer, String>(1, "Java");

        // boolean result = Util.<Integer, String>compare(p1,p2);
        boolean result = Util.compare(p1,p2);  // 생략가능

        System.out.println("p1 == p2: " + result);


        Pair<String, String> p3 = new Pair<String,String>("홍길동", "Java");
        Pair<String, String> p4 = new Pair<String,String>("이순신", "Java");

        boolean result2 = Util.compare(p3,p4);  // 생략가능

        System.out.println("p3 == p4: " + result2);
    }
}