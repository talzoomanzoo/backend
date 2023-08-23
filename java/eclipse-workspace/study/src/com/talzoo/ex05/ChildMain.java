package com.talzoo.ex05;

public class ChildMain {
    public static void main(String[] args) {
        Parent parent = new Child(); // override 했을 경우 실제 객체의 메소드를 실행함

        parent.method01();
        parent.method02();
        // parent.method03(); // 실제 객체가 child임에도 불구하고, 타입이 부모 타입이라서 자식만이 가지고 있는 메소드는 접근 불가 (부모는 자식 것 손 못댐)
        
        Child child = (Child) parent;
        child.method03(); // 동일한 객체인데 어느 타입 클래스에 따라서 접근이 다름
        child.method01();
        child.method02();
    }
}
