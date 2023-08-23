package com.talzoo.ex19;

import java.util.Arrays;

public class CourseMain {
    public static void registerCourse(Course<?> course) {
        System.out.println(course.getName() + " 수강생");
        System.out.println(Arrays.toString(course.getStudents()));
        System.out.println();
    }

    public static void registerCourseStudent(Course<? extends Student> course) { // (상속과는 상관 없음) 파라미터로 오는 객체는 student나 student의 하위 클래스 담을 수 있음
        System.out.println(course.getName() + " 수강생");
        System.out.println(Arrays.toString(course.getStudents()));
        System.out.println();
    }

    public static void registerCourseWorker(Course<? super Worker> course) { // 파라미터로 오는 객체는 worker나 worker의 상위클래스를 담을 수 있음
        System.out.println(course.getName() + " 수강생"); // generic 메소드가 아니라 파라미터로 generic 객체 받음
        System.out.println(Arrays.toString(course.getStudents()));
        System.out.println();
    }

    public static void main(String[] args) {
        Course<Person> personCourse = new Course<Person>("일반인과정", 5); // Person 객체를 만들것
		personCourse.add(new Person("일반인"));
		personCourse.add(new Worker("직장인"));
		personCourse.add(new Student("학생"));
		personCourse.add(new GraduateStudent("대학원생"));
		
		Course<Worker> workerCourse = new Course<Worker>("직장인과정", 5);
		workerCourse.add(new Worker("직장인"));
		
		Course<Student> studentCourse = new Course<Student>("학생과정", 5);
		studentCourse.add(new Student("학생"));
		studentCourse.add(new GraduateStudent("대학원생"));
		
		Course<GraduateStudent> graduateStudentCourse = new Course<GraduateStudent>("대학원과정", 5);
		graduateStudentCourse.add(new GraduateStudent("대학원생"));
		
		registerCourse(personCourse); 
		registerCourse(workerCourse);
		registerCourse(studentCourse);
		registerCourse(graduateStudentCourse);
		System.out.println();
		
		registerCourseStudent(studentCourse);
		registerCourseStudent(graduateStudentCourse);
//		registerCourseStudent(personCourse);
//		registerCourseStudent(workerCourse);
		System.out.println();
		
		registerCourseWorker(personCourse);
		registerCourseWorker(workerCourse);
//		registerCourseWorker(studentCourse);
//		registerCourseWorker(graduateStudentCourse);
    }
}
