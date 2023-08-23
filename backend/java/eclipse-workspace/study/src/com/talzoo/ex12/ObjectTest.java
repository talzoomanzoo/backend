package com.talzoo.ex12;

public class ObjectTest {
    public static void main(String[] args) {
        int [] a = {1, 2, 3};
        int [] b = {1, 2, 3};

        System.out.println(a == b); // false (reference 값비교: 다름)
        System.out.println(a.equals(b)); //false (reference 값비교: 다름)

        String s1 = new String("Hello");
        String s2 = new String("Hello");

        System.out.println(s1 == s2); // false (reference 값비교: 다름)
        System.out.println(s1.equals(s2)); // true (String에 있는 equals: 내용을 비교함)
    }
}
