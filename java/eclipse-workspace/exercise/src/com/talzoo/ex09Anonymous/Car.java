package com.talzoo.ex09Anonymous;

public class Car {
    // 필드 선언
    public Tire tire = new Tire();
    
    public Tire tire2 = new Tire() { // 필드에서 익명객체를 사용
        @Override
        void roll() {
            System.out.println("한국 타이어가 회전합니다.");
        }
    };

    // 메소드 선언
    public void run() {
        tire.roll();
        tire2.roll(); // 필드의 익명객체 받아옴
    }

    public void run2() {
        Tire tire = new Tire() { // 지역변수가 익명객체를 참조함
            @Override
            void roll() {
                System.out.println("금호 타이어가 회전합니다.");
            }
        };

        tire.roll();
    }

    public void run3(Tire tire) { 
        tire.roll();
    }
}
