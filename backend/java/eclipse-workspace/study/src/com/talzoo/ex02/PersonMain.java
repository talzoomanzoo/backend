package com.talzoo.ex02;

/**
 * PersonMain
 */
public class PersonMain {

    public static void main(String[] args) {
        Person p1 = new Person("123456-123123", "홍길동");

        System.out.println(p1.nationality);
        System.out.println(p1.ssn);
        System.out.println(p1.name);

        p1.name = "이순신";
        System.out.println(p1.name);

        /* p1.nationality = "USA"; // final 이라서 못 바꿈
        p1.ssn = "22222222222222"; */ // final
    }
}