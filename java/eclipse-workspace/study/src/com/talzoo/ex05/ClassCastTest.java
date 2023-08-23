package com.talzoo.ex05;


class A {}

class B extends A {}
class C extends A {}

class D extends B {}
class E extends C {}

public class ClassCastTest {
    public static void main(String[] args) {
        B b = new B();
        C c = new C();
        D d = new D();
        E e = new E();

        A a1 = b; // 서로 타입이 다른데 casting이 됨. (흡사 자동 형변환) // 자식 객체 레퍼런스는 부모타입 레퍼런스에 저장 가능 //polymorphism의 기본
        A a2 = c;
        A a3 = d;
        A a4 = e;

        B b1 = d;
        C c1 = e;

        /* B b3 = e; 
        C c2 = d; */ // 불가
    }
}
