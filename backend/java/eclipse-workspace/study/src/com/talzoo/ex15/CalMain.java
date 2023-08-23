package com.talzoo.ex15;

public class CalMain {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        User01 user01 = new User01();
        user01.setCalculator(calculator);
        user01.start();

        User02 user02 = new User02();
        user02.setCalculator(calculator); // cal2하면 multithreading 필요 x
        user02.start();
    } // 2개 이상의 thread가 공유 객체 (shared object)를 사용할 때 발생
      //memory가 덮어씌워져서 둘 다 50이 나옴
}
