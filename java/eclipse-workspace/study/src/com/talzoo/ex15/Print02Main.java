package com.talzoo.ex15;

public class Print02Main {
    public static void main(String[] args) {
        Thread thread = new PrintThread2();
        thread.start();

        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            // TODO: handle exception
        }

        thread.interrupt(); //방법1)thread.sleep(1) 와중 interrupt // 방법2) 한번 실행하고 물어봄
    }
}
