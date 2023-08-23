package com.talzoo.ex05;

public class Computer extends Calculator{ // class의 final은 상속 금지

    @Override
    public double areaCircle(double radius) { // 메소드의 final은 overwrite 금지
        // TODO Auto-generated method stub (자동생성한 code)
        System.out.println("Computer의 areacircle");
        return Math.PI * radius * radius;
    }  // 부모의 메소드를 고쳐쓰고 싶음

    
/*     @Override
    public double areaCircle(double radius) { // method signature는 100% 일치 : method overwriting (메소드의 재정의)
        System.out.println("Computer의 areacircle");
        return Math.PI * radius * radius;
    } */
}
