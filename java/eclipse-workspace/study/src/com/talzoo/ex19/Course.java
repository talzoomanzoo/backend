package com.talzoo.ex19;

public class Course<T> {
    private String name;
    private T[] students;


    public Course(String name, int capacity) {
        this.name = name;
        this.students = (T[]) new Object[capacity]; //new T[capacity]; 타입변수로 직접 배열이 불가해서 강제 형변환
    }


    public String getName() {
        return name;
    }


    public T[] getStudents() {
        return students;
    }

    public void add(T t) {
        for(int i=0; i < students.length; i++) {
            if(students[i] == null) {
                students[i] = t;
                break;
            }
        }
    }
}
