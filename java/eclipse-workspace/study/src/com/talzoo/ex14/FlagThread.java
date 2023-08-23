package com.talzoo.ex14;

public class FlagThread extends Thread {

            @Override
            public void run() {
        // TODO Auto-generated method stub
            for(int i = 0; i < 10; i++) {
            System.out.println("청기");
            try {
                Thread.sleep(500); // 500ms (0.5s), sleep: static field
            } catch (Exception e) { // 일반예외 발생
            }
        }
    }

}
