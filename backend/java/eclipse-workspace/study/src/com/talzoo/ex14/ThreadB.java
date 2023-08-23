package com.talzoo.ex14;

public class ThreadB extends Thread{

    @Override
    public void run() {
        // TODO Auto-generated method stub
        System.out.println(getName() + "-실행");
    }

}
