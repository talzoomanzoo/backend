package com.talzoo.ex12;

public class WrapperTest {
    public static void main(String[] args) {
        // byte Byte, char Character, short Short, int Integer, long Long, float Float, double Double
        // Wrapper Class

        Integer a = 10; // autoboxing: a (reference 값 담고 있음) -> 10이라는 값을 가지고 있는 heap의 객체
        Integer b = 10;

        System.out.println(a + b); // auto-unboxing: a에서 10 꺼내고 b에서 20 꺼내서 더함

        System.out.println(a);
        System.out.println(b);

        String s = "100";
        int c = 200;

        /* int d = c + s; */ // error
        int d= c + Integer.parseInt(s); // 문자열을 int로 바꿔주는 법
        System.out.println(d);

        Double e = 10.0;
        System.out.println(e.doubleValue());

        Integer f = 20;
        System.out.println(f.doubleValue());

/*         Character ch = 'A';
        System.out.println(ch.doubleValue()); */ // 안됨.

        System.out.println(a == b);
        System.out.println(a.equals(b));

    }
}
