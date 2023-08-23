package com.talzoo.ex17;

public class BoxMain {
    public static void main(String[] args) {
        // Box<String> box01 = new Box<String>();
        Box<String> box01 = new Box<>(); // 컴파일러가 유추 가능해서 생략이 가능하다

        box01.setT("홍길동");
        String name = box01.getT();
        System.out.println(name);


        Box<Integer> box02 = new Box<Integer>(); // Wrapper class로 바뀜. <> 안에는 클래스 이름만 올 수 있음

        box02.setT(10);
        int num = box02.getT();
        System.out.println(num);
    }
}
