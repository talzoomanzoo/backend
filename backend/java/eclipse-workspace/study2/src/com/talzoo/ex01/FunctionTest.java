package com.talzoo.ex01;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.ToIntFunction;

public class FunctionTest {
    private static List<Student> list = Arrays.asList(
            new Student("아이유", 95, 80),
            new Student("허영지", 90, 85));

    public static void printString(Function<Student, String> function) {  // < the type of the input to the function, the type of the result of the function>
        for (Student student : list) {
            System.out.println(function.apply(student)); // .apply(the function argument)
        }
        System.out.println();
    }

    public static void printInt(ToIntFunction<Student> function) {
        for (Student student : list) {
            System.out.println(function.applyAsInt(student));
        }
        System.out.println();
    }

    public static void printString2(MinjuInterface who) {
        for (Student student : list) {
            System.out.println(who.minju(student));
        }
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.println("[학생이름]");
        printString(t -> t.getName());

        System.out.println("[영어점수]");
        printInt(t -> t.getEnglishScore());

        System.out.println("[수학점수]");
        printInt(t -> t.getMathScore());

        printString2(new MinjuImpl());

    }
}
