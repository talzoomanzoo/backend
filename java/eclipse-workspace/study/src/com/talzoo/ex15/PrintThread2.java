package com.talzoo.ex15;

public class PrintThread2 extends Thread{

/*     @Override // 방법 1)
    public void run() {
        // TODO Auto-generated method stub
        try {
            while(true) {
                System.out.println("실행 중");
                Thread.sleep(1);
            }
        } catch (InterruptedException e) {
            // TODO: handle exception
        }
        System.out.println("리소스 정리");
        System.out.println("실행 종료");
    } */

        @Override // 방법2)
    public void run() {
        // TODO Auto-generated method stub
        while(true) {
            System.out.println("실행 중");
            if (Thread.interrupted()) { // thread가 주체가 되어서 한번 실행하고 interrupt 걸렸는지 물어봄
                break;
            }
        }
        System.out.println("리소스 정리");
        System.out.println("실행 종료");
    }
}
