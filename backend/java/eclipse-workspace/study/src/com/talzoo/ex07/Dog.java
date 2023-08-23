package com.talzoo.ex07;

public class Dog extends Animal { // 반드시 부모의 추상 클래스의 바디를 override 해야함 (abstract가 아니라 일반 객체를 만들려면)

    @Override
    public void sound() {
        // TODO Auto-generated method stub
        System.out.println("멍멍"); // 1. 나를 상속받는 자식 클래스들이 특정 메소드를 강제적으로 override 하게 만드는 방법, 2. 객체의 사용방법을 규정
    } 
    
}
