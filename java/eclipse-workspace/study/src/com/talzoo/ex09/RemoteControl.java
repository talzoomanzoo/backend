package com.talzoo.ex09;

public interface RemoteControl {
    public int MAX_VOLUME = 10; // 상수 대문자 public static final int
    public int MIN_VOLUME = 0;


    public void turnOn(); // public abstract void 
    public void turnOff();
    public void setVolume(int volume);
    default void setMute(boolean mute) { // public void setMute(boolen mute) 하면 다른 클래스에서 난리남 override
        if (mute) {
            System.out.println("무음처리");
        } else {
            System.out.println("무음해제");
        } //선택적 override
    }
    
    static void changeBattery() {
        System.out.println("배터리 교체");
    }
}
