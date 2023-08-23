package com.talzoo.ex09;

public class RemoteMain {
    public static void main(String[] args) {
        RemoteControl rc = new Television(); // Television 클래스(RemoteControl인터페이스의 구현클래스)의 객체인데 따지고 보니 RemoteControl인터페이스의 구현객체
        rc.turnOn();
        rc.setVolume(20);
        rc.turnOff();
        rc.setMute(true);
        System.out.println("=====================");

        rc = new Audio();
        rc.turnOn();
        rc.setVolume(20);
        rc.turnOff();
        rc.setMute(true);

        System.out.println("=======================");
        Television tv = new  Television();
        tv.setSubtitle(true);


        System.out.println("=====================");
        // anonymous 구현객체: 한번 쓰고 말 클래스를 사용하는 법
        RemoteControl rc2 = new RemoteControl() { // 구현 클래스의 내용이 모두 들어감
                private int volume;

/*                 @Override
                public void turnOn() {
                    // TODO Auto-generated method stub
                    throw new UnsupportedOperationException("Unimplemented method 'turnOn'");
                }

                @Override
                public void turnOff() {
                    // TODO Auto-generated method stub
                    throw new UnsupportedOperationException("Unimplemented method 'turnOff'");
                }

                @Override
                public void setVolume(int volume) {
                    // TODO Auto-generated method stub
                    throw new UnsupportedOperationException("Unimplemented method 'setVolume'");
                } */

                
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

                System.out.println("현재 X-box volume: " + this.volume);
                }

                @Override
                public void turnOff() {
                    // TODO Auto-generated method stub
                    System.out.println("X-box Off");
                }

                @Override
                public void turnOn() {
                    // TODO Auto-generated method stub
                    System.out.println("X-box On");
                }
            };
            rc2.turnOn();
            rc2.setVolume(20);
            rc2.turnOff();

            System.out.println("==================");
            RemoteControl.changeBattery();
        }
}
