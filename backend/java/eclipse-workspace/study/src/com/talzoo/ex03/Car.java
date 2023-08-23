package com.talzoo.ex03;

public class Car { // Encapsulation: 객체의 속성(data fields)과 행위(methods)를 하나로 묶고 (class라는 하나의 타입에), 실제 구현 내용 일부를 외부에 감추어 은닉한다.
    private int speed; // 유지보수를 위해서 무조건 field 는 private으로 만들고 getter setter 만들어라
    private boolean stop; // field에 대해서는 private으로 막아둠: 메서드를 통해서 값을 가지고 오고 변화함 getter setter
    // 값을 할당 안해도 int = 0, boolean = False
    public int getSpeed() {
        return speed;
    }
    public void setSpeed(int speed) {
        if (speed < 0) {
            this.speed = 0;
        } else {
            this.speed = speed;
        } // validation check
    }
    public boolean isStop() { //boolean type getter = is
        return stop;
    }

    public void setStop(boolean stop) {
        this.stop = stop;
        this.setSpeed(0);
    }

    
}
