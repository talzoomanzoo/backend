package com.talzoo.ex06;

public enum TrafficLight {
    RED("정지"), GREEN("직진"), ARROW("좌회전");
    // private static TrafficLight RED = new TrafficLight("정지")
    
    private String command;
    
    private TrafficLight() {}

    private TrafficLight(String command) {
        this.command = command;
    }

    public String getCommand() {
        return command;
    }
}
