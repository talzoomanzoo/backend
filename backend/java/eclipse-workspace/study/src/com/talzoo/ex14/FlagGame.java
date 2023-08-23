package com.talzoo.ex14;

public class FlagGame { // ex13) Runnable의 구현객체를 thread 생성자에 넣고, ex14) Thread를 상속받는 자식 객체
    public static void main(String[] args) {
        /* Thread thread = new FlagThread();*/

        Thread thread = new Thread() {  // 익명 자식객체
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
};
// thread 생성하는 방법 1: thread class의 생성자에 runnable 구현객체 넣기
// thread 생성하는 방법 2: thread class의 자식객체
// 무언가를 상속받은 클래스는 thread를 상속받지 못해서 runnable 사용
// -eg. public class Strudent extends Person implements Runnable
thread.start(); 

        for(int i = 0; i<10; i++) {
            System.out.println("백기");
            try {
                Thread.sleep(500);
            } catch (Exception e) {
                // TODO: handle exception
            }
        }
    }
}

//최상의 성능을 내는 thread의 개수 = core의 수 * 2