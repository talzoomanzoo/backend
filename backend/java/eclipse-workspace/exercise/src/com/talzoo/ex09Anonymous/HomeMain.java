package com.talzoo.ex09Anonymous;

public class HomeMain {
    public static void main(String[] args) {
        Home home = new Home();
        
        home.turnvolmuteTV();
        
        System.out.println("=======================");

        home.turnmuteSiri();

        System.out.println("=======================");

        home.openFridge(new RemoteControl() {

            @Override
            public void turnOn() {
                // TODO Auto-generated method stub
                System.out.println("냉장고를 킵니다.");;
            }

            @Override
            public void turnOff() {
                // TODO Auto-generated method stub
                System.out.println("냉장고를 끕니다.");;
            }
            
        });
        System.out.println("=====================");
        RemoteControl.changeBattery();
    }
}
