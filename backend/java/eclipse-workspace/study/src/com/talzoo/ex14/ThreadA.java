package com.talzoo.ex14;

public class ThreadA extends Thread {
    
    public ThreadA() {
        setName("ThreadA"); //Thread라는 부모 클래스의 메소드 setter
    }

    @Override
    public void run() {
        // TODO Auto-generated method stub
        System.out.println(getName() + "-실행");
    }

    
}
