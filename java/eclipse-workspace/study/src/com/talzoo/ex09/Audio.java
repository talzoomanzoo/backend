package com.talzoo.ex09;

public class Audio implements RemoteControl {
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

        System.out.println("현재 Audio volume: " + this.volume);
    }

    @Override
    public void turnOff() {
        // TODO Auto-generated method stub
        System.out.println("Audio Off");
    }

    @Override
    public void turnOn() {
        // TODO Auto-generated method stub
        System.out.println("Audio On");
    }
}
