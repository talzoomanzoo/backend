package com.talzoo.ex18;

public class UtilMain {
    public static void main(String[] args) {
        int result01 = Util.compare(10, 20);
        System.out.println(result01);

        int result02 = Util.compare(4.5, 2.0);
        System.out.println(result02);

        /* int result02 = Util.compare("Hello", "Hi");
        System.out.println(result02); */ //number를 상속 받은 게 아니라서 막아버림
    }
}
