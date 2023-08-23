package com.talzoo.ex07;

public class PhoneMain {
    public static void main(String[] args) {
        //Phone phone = new Phone(); // cannot instantiate type phone: 추상클래스 자체로는 객체 생성이 불가 eg. new Phone() x

        SmartPhone phone = new SmartPhone("홍길동"); // 추상클래스를 상속 받은 일반클래스는 객체 생성이 가능
        phone.turnOn();
        phone.internetSearch();
        phone.turnOff();
    }
}
