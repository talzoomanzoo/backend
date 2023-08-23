package com.talzoo.ex06;

public class TrafficMain {
    public static void main(String[] args) {
        TrafficLight stopLight = TrafficLight.RED;
        System.out.println(stopLight.getCommand());

        TrafficLight goLight = TrafficLight.GREEN;
        System.out.println(goLight.getCommand());
    }
}
