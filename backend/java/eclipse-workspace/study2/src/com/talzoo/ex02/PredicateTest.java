package com.talzoo.ex02;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateTest {
    private static List<Student> list = Arrays.asList( // 고정길이 (정적)
            new Student("홍길동", "남자", 90),
            new Student("김영희", "여자", 90),
            new Student("박철수", "남자", 85),
            new Student("이혜숙", "여자", 87));

    public static double avg(Predicate<Student> predicate) {
        int count = 0, sum = 0;
        for (Student student : list) {
            if (predicate.test(student)) { // predicates mean functions with one argument that return a boolean value
                count++;
                sum += student.getScore();
            }
        }
        return (double) sum / count;
    }

    public static void main(String[] args) {
        double maleAvg = avg(t -> t.getSex().equals("남자"));
        System.out.println("남자 평균점수: " + maleAvg);

        double femaleAvg = avg(t -> t.getSex().equals("여자"));
        System.out.println("여자 평균점수: " + femaleAvg);
    }
}
