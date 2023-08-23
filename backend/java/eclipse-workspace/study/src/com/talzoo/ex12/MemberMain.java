package com.talzoo.ex12;

public class MemberMain {
    public static void main(String[] args) {
        Member m1 = new Member("홍길동");
        Member m2 = new Member("김선달");
        Member m3 = new Member("홍길동");

        System.out.println(m1.equals(m2)); // false
        System.out.println(m2.equals(m3)); // false
        System.out.println(m1.equals(m3)); // true // object 메소드였는데 -> 우리가 만든 메소드로 overriding 바뀜

        System.out.println(m1);
        System.out.println(m2);
        System.out.println(m3); // toString Override

        /* System.out.println(m1.id); */ // 클래스 외부에서 getter로만 접근됨 
    }
}
