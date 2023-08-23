package com.talzoo.ex07Inheritance;

public class SmartPhone extends Phone {
    // 추가 필드 선언
    public boolean wifi;

    // 자식 생성자 선언
    public SmartPhone(String model, String color, boolean wifi) {
        super(model, color);
        this.wifi = wifi;
        System.out
                .println("SmartPhone() 자식 생성자 실행," + this.model + " 모델" + this.color + " 색상" + this.wifi + " 와이파이 상태");
    }
}
