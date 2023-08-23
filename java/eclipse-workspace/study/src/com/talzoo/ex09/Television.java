package com.talzoo.ex09;

public class Television implements RemoteControl { // 3개의 추상 메소드를 구현하기 전까지는 컴파일이 안됨
    private int volume;

    @Override
    public void setVolume(int volume) {
        // TODO Auto-generated method stub
        if (volume > RemoteControl.MAX_VOLUME) {
            this.volume = RemoteControl.MAX_VOLUME;
        } else if (volume < RemoteControl.MIN_VOLUME) {
            this.volume = RemoteControl.MIN_VOLUME;
        } else {
            this.volume = volume;
        }

        System.out.println("현재 TV volume: " + this.volume);
    }

    @Override
    public void turnOff() {
        // TODO Auto-generated method stub
        System.out.println("TV Off");
    }

    @Override
    public void turnOn() {
        // TODO Auto-generated method stub
        System.out.println("TV On");
    }

    @Override
    public void setMute(boolean mute) {
        // TODO Auto-generated method stub
        if (mute) { // if true
            System.out.println("TV 무음처리");
        } else { // if false
            System.out.println("TV 무음해제");
        }
    }

    public void setSubtitle(boolean sub) {
        if (sub) {
            System.out.println("자막 On");
        } else {
            System.out.println("자막 Off");
        }
    }
    
}
