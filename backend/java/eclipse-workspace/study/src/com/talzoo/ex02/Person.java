package com.talzoo.ex02;

public class Person {
    final String nationality = "Korea"; // cannot change
    final String ssn;  // cannot change
    String name;


    public Person(String ssn, String name) { // Ctrl + . : Generate Constructors
        this.ssn = ssn;
        this.name = name;
    }

    
}
