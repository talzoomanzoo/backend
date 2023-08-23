package com.talzoo.ex13;

/**
 * FlagGame
 */
public class FlagGame {

    public static void main(String[] args) {
        /* for(int i = 0; i < 10; i++) {
            System.out.println("청기");
            try {
                Thread.sleep(500); // 500ms (0.5s), sleep: static field
            } catch (Exception e) { // 일반예외 발생

            }
        } */

        /* Runnable flagTask = new FlagTask(); // runnable interface의 구현객체 */
        // Runnable runnable = new Runnable(); // 이러려면 구현 클래스 있어야 함
        Thread thread = new Thread(new Runnable() { // 인터페이스에서 바로 익명 구현객체 or 구현 클래스 만들기
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
            
        ); // thread 객체
        thread.start(); // JVM: class loader - > static load -> main thread 기동: static 영역에서 main 메소드 찾아서 실행 -> main 메소드에서 새로운 스레드를 실행하니까 main thread와 동시에 실행
        // start 준비만 시키는 동작, 실제 start는 JVM 내에서

        for(int i = 0; i < 10; i++) {
            System.out.println("백기");
            try {
                Thread.sleep(500); // 500ms (0.5s), sleep: static field // 둘다 500이라서 번갈아서 나옴. 다르게 되면 놉
            } catch (Exception e) { // 일반예외 발생

            }
        }
    }
}