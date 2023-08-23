package com.talzoo.ex02;

import java.util.Arrays;
import java.util.List;

public class StudentTest {
    private static List<Student> list = Arrays.asList(
            new Student("홍길동", "남자", 90),
            new Student("김영희", "여자", 90),
            new Student("박철수", "남자", 85),
            new Student("이혜숙", "여자", 87));

    public static double avg(List<Student> list, String sex) {
        int count = 0; 
        int sum = 0;
        for (Student student : list) {
            if (student.getSex().equals(sex)) {
                count ++;
                sum += student.getScore();
            }  
        }
        return (double) sum / count;
    }

    public static void main(String[] args) {
        System.out.println("남자 평균 점수: " + avg(list, "남자"));
        System.out.println("여자 평균 점수: " +avg(list, "여자"));
    }
}
