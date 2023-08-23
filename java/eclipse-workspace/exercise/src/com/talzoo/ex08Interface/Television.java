package com.talzoo.ex08Interface;

public class Television implements RemoteControl, Searchable {

    @Override
    public void turnOn() {
        // TODO Auto-generated method stub
        System.out.println("TV를 킵니다.");
    }

    @Override
    public void turnOff() {
        // TODO Auto-generated method stub
        System.out.println("TV를 끕니다.");
    }

    @Override
    public void setMute(boolean mute) {
        // TODO Auto-generated method stub
        RemoteControl.super.setMute(mute);
    }

    @Override
    public void setVolume(int volume) {
        // TODO Auto-generated method stub
        RemoteControl.super.setVolume(volume);
    }

    @Override // Searchable interface
    public void search(String url) {
        // TODO Auto-generated method stub
        System.out.println(url + "을 검색 중입니다.");
    }

    
    
}
