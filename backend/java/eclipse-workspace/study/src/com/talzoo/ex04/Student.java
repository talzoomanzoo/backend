package com.talzoo.ex04;

public class Student extends Person { // 부모의 기본생성자가 존재하지 않는다 
    private int studentNo;

    public Student(String name, String ssn, int studentNo) {
        super(name, ssn); // 부모의 생성자를 super로 호출 // 부모 클래스 생성자 수행 완료: heap 영역에 부모 객체가 생성됨
        // 부모는 기본생성자가 없어서 여기서는 생략 불가
        this.studentNo = studentNo; // 자식 클래스 생성자 수행 완료: heap 영역에 자식 객체 생성
    }

    public int getStudentNo() {
        return studentNo;
    }

}
