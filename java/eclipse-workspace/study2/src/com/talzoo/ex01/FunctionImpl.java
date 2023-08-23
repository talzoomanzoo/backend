package com.talzoo.ex01;

import java.util.function.Function;

public class FunctionImpl implements java.util.function.Function<Student, String> {
    
    @Override
    public String apply(Student t) {
        return t.getName();
    }

    public static void main(String[] args) {
        System.out.println("[학생이름]");

        Function<Student, String> f = new FunctionImpl();
        printString(f);
    }

    private static void printString(Function<Student, String> f) {
    }

}
