package com.talzoo.ex04;

public class PersonMain {
        public static void main(String[] args) {
        Student student = new Student("홍길동", "123456-123123", 30);

        System.out.println("이름: " + student.getName());
        System.out.println("주민등록번호: " + student.getSsn());
        System.out.println("학번: " + student.getStudentNo());
    }
}
