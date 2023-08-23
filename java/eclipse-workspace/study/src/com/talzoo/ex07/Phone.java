package com.talzoo.ex07;

public abstract class Phone { // abstract: 추상 class
    public String owner;

    public Phone(String owner) {
        this.owner = owner;
    }

    public void turnOn() {
        System.out.println("전원 켜기");
    }

    public void turnOff() {
        System.out.println("전원 끄기");
    }
}
