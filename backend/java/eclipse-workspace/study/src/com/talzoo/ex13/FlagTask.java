package com.talzoo.ex13;

public class FlagTask implements Runnable{
    // runnable implements 해야한다: 추상 메소드를 override 해야 한다. 그렇다면 추상메소드는 뭐가 있을지 찾아보기
    // void type의 run() 메소드 overrirde 해야한다. 왜냐면 FlagTask의 객체는 객체.run을 호출할 것이기 때문이다.
    // 나중에 runnable 상속 받을 수도 있으니까 implements 하자.
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
