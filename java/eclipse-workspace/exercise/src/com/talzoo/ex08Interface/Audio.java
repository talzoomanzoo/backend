package com.talzoo.ex08Interface;

public class Audio implements RemoteControl {

    @Override
    public void turnOn() {
        // TODO Auto-generated method stub
        System.out.println("오디오를 킵니다.");
    }

    @Override
    public void turnOff() {
        // TODO Auto-generated method stub
        System.out.println("오디오를 끕니다.");
    }
    
}
