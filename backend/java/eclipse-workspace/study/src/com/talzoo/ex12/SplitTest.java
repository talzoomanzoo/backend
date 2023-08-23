package com.talzoo.ex12;

public class SplitTest {
    public static void main(String[] args) {
        String s = "Hi, my name is Tom.";
        String[] tokens = s.split(" ");
        for (String token : tokens) {
            System.out.println(token);
        }

        System.out.println("----------------------------");

        StringBuilder sb = new StringBuilder(); // 훨씬 빠름: String s = "Java" + "Class" + "Open" 할 때마다 객체 만들었다가 폭파시키면 메모리 낭비 심함
        sb.append("Java ");
        sb.append("Class ");
        sb.append("Open!");
        System.out.println(sb.length());
        System.out.println(sb.toString());

        // StringBuffer는 StringBuilder와 사용법 동일, thread safe 버전 but 굳에 안써도 되는 상황에서 사용하면 내부적인 성능에서 손해를 봄 
    }
}
