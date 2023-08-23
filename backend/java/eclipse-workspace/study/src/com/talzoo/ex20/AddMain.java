package com.talzoo.ex20;

public class AddMain {
    public static void main(String[] args) {
        AddInterface a = new AddInterface() {

            @Override
            public int add(int a, int b) {
                // TODO Auto-generated method stub
                return a+b;
            }
            
        };
        
        int b = a.add(100, 200);
        System.out.println(b);
        System.out.println(a.add(100, 200));


        //Lambda 식의 target type은 오로지 하나의 추상메소드 (이런 interface -> functional interface, 클래스는 안됨)만 있어야 한다. 
        //왜냐하면 그 위와는 다르게 어떤 메소드를 override 했는지 안써주니까
        // 여기서 targe type은 AddInterface
        AddInterface result = (c, d) -> c + d; // 인터페이스의 추상 메소드 내용을 override 한 구현 객체
        System.out.println(result.add(10, 50)); // Lambda Expression
    }
}
