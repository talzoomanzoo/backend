package com.talzoo.ex15;

public class AutoSaveThread extends Thread{

    @Override
    public void run() {
        // TODO Auto-generated method stub
        while(true) {
            System.out.println("저장 완료");
            try {
                Thread.sleep(200);
            } catch (Exception e) {
                // TODO: handle exception
            }
        }
    }
    
}
