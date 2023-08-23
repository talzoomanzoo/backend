package com.talzoo.ex21;

/**
 * FlagGame
 */
public class FlagGame {

    public static void main(String[] args) {
        Thread thread = new Thread(()-> {for(int i = 0; i < 10; i++) { // 메소드가 하나인 인터페이스를 인자로 받는 것은 runnable뿐
            System.out.println("청기");
            try {
                Thread.sleep(500); 
            } catch (Exception e) {
        } 
    };
});
        
        
        thread.start(); 

        for(int i = 0; i < 10; i++) {
            System.out.println("백기");
            try {
                Thread.sleep(500); 
            } catch (Exception e) { 

            }
        }
    }
}