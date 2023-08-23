package com.talzoo.ex08Interface;

public class RemoteMain {
    public static void main(String[] args) {
        RemoteControl rc = new Television();
        rc.turnOn();
        rc.setVolume(5);
        rc.setVolume(40);
        // rc.search("www.youtube.com"); RemoteControl의 메소드가 아니라서 syntax error
        rc.setMute(true);
        rc.turnOff();

        rc = new Audio();
        rc.turnOn();
        rc.turnOff();

        Searchable rc2 = new Television();
        rc2.search("www.youtube.com");
    }
}
