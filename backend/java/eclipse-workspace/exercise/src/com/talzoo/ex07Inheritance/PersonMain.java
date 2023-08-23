package com.talzoo.ex07Inheritance;

public class PersonMain {
    public static void personInfo(Person person) {
        if (person instanceof Student) {
            Student student = (Student) person;
            System.out.println(student.name + "이(가) 걷습니다.");
            System.out.println("학번" + student.studentNo);
        } else {
            System.out.println(person.name + "이(가) 걷습니다.");
        }
    }

    public static void main(String[] args) {
        Person personA = new Person("홍길동");
        PersonMain.personInfo(personA);
        personA.walk();

        Student studentA =  new Student("이순신", 2018120120);
        PersonMain.personInfo(studentA);
        studentA.walk();
    }
}
