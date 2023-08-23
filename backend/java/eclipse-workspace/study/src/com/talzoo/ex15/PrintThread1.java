package com.talzoo.ex15;

public class PrintThread1 extends Thread{
    private boolean stop = false;

    public void setStop(boolean stop) {
        this.stop = stop;
    }

    @Override
    public void run() {
        // TODO Auto-generated method stub
        while(!stop) {
            System.out.println("실행 중");
        }
        System.out.println("리소스 정리");
        System.out.println("실행 종료");
    }
}
