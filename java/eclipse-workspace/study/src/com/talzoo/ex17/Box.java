package com.talzoo.ex17;
// Generic class 만드는 방법
public class Box<T> { //<T> 이 안에 있는 T는 이 타입으로 객체를 생성할 때 만들라고 하는 거구나라고 인식
    private T t; // 객체 만들 때 직접 타입 정해주기 위해서

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
}
