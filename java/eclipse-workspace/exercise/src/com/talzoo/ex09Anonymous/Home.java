package com.talzoo.ex09Anonymous;

public class Home { // 익명 구현 객체와 그것들의 메소드 만들기, without 구현 클래스
    // 필드 선언
    RemoteControl rc = new RemoteControl() {
        // 1.Television
        @Override
        public void turnOn() {
            // TODO Auto-generated method stub
            System.out.println("TV를 킵니다.");
            ;
        }

        @Override
        public void turnOff() {
            // TODO Auto-generated method stub
            System.out.println("TV를 끕니다.");
        }

        @Override
        public void setVolume(int volume) {
            if (volume > MAX_VOLUME) {
                volume = MAX_VOLUME;
                System.out.println("TV볼륨:" + volume);
                System.out.println("TV최대 소리" + volume + "까지밖에 안됩니다.");
            } else if (volume < MIN_VOLUME) {
                volume = MIN_VOLUME;
                System.out.println("TV볼륨:" + volume);
                System.out.println("TV최소 소리" + volume + "까지밖에 안됩니다.");
            } else {
                System.out.println("TV볼륨:" + volume);
            }
        }

        @Override
        public void setMute(boolean mute) {
            if (mute) {
                setVolume(MIN_VOLUME);
                System.out.println("TV음소거");
            }
            System.out.println("TV음소거 해제");
        }
    };

    // 메소드 선언
    public void turnvolmuteTV() {
        // TV
        rc.turnOn();
        rc.setVolume(50);
        rc.setMute(true);
        rc.turnOff();
    }

    public void turnmuteSiri() {
        RemoteControl rc = new RemoteControl() {
            // Audio
            @Override
            public void turnOn() {
                // TODO Auto-generated method stub
                System.out.println("Audio를 킵니다.");;
            }

            @Override
            public void turnOff() {
                // TODO Auto-generated method stub
                System.out.println("Audio를 끕니다.");;
            }
        }; // 지역변수에 익명구현객체 선언
        rc.turnOn();
        rc.setVolume(5);
        rc.setMute(true);
        rc.turnOff();
    }

    public void openFridge(RemoteControl remoteControl) {
        // Refridgerator
        remoteControl.turnOn();
        System.out.println("냉장고 문을 엽니다.");
        remoteControl.turnOff();
    }

}
