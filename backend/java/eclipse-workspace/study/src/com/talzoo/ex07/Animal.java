package com.talzoo.ex07;

public abstract class Animal {
    public void live() {
        System.out.println("먹고 싸고");
    }

    public abstract void sound(); // 상속받는 자식 객체에 따라서 다르게 정의됨 -> body가 없는 추상 메소드 만들어 줌
    // 클래스 안에 하나 이상의 추상 메소드가 들어가면 클래스도 abstract가 되어야 함 (일반 class X)

}
