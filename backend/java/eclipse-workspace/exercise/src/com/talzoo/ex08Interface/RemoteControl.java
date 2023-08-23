package com.talzoo.ex08Interface;

public interface RemoteControl {
    // 상수 선언
    int MAX_VOLUME = 10;
    int MIN_VOLUME = 0;

    // 추상 메소드 선언
    void turnOn();
    void turnOff();

    // 디폴트 메소드 선언
    default void setVolume(int volume) {
        if (volume > MAX_VOLUME) {
            volume = MAX_VOLUME;
            System.out.println("볼륨을 " + volume + "으로 설정했습니다.");
        } else if (volume < MIN_VOLUME) {
            volume = MIN_VOLUME;
            System.out.println("볼륨을 " + volume + "으로 설정했습니다.");
        } else {
            System.out.println("볼륨을 " + volume + "으로 설정했습니다.");
        }
    }

    default void setMute(boolean mute) {
        if (mute) {
            setVolume(MIN_VOLUME);;
            System.out.println("무음 처리합니다.");
        } else {
            System.out.println("무음 해제합니다.");
        }
    }

    // 정적 메소드 선언
    static void ChangeBattery() {
        System.out.println("배터리 교체");
    }
}
