package com.talzoo.ex09Anonymous;

public interface RemoteControl {
    //상수 선언
    int MAX_VOLUME = 20;
    int MIN_VOLUME = 0;

    // 메소드 선언
    void turnOn();
    void turnOff();
    default void setVolume(int volume) {
        if (volume > MAX_VOLUME) {
            volume = MAX_VOLUME;
            System.out.println("볼륨:" + volume);
            System.out.println("최대 소리" + volume + "까지밖에 안됩니다.");
        } else if (volume < MIN_VOLUME) {
            volume = MIN_VOLUME;
            System.out.println("볼륨:" + volume);
            System.out.println("최소 소리" + volume + "까지밖에 안됩니다.");
        } else {
            System.out.println("볼륨:" + volume);
        }
    }
    default void setMute(boolean mute) {
    if (mute) {
        setVolume(MIN_VOLUME);
        System.out.println("음소거");
    }
    System.out.println("음소거 해제");   
    }
    public static void changeBattery() {
        System.out.println("리모콘 배터리 교체");
    }
}
