package com.talzoo.ex07Inheritance;

public class Student extends Person {
    public int studentNo;
    
    public Student (String name, int studentNo) {
        super(name);
        this.studentNo = studentNo;
    }
}
