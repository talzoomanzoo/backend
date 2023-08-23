package com.talzoo.ex15;

public class Print01Main {
    public static void main(String[] args) {
        PrintThread1 printThread = new PrintThread1();

        printThread.start();
        
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            // TODO: handle exception
        }

        printThread.setStop(true);
    }
}
