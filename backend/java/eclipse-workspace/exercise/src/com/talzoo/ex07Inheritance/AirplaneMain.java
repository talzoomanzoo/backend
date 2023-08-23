package com.talzoo.ex07Inheritance;

public class AirplaneMain {
    public static void main(String[] args) {
				SupersonicAirplane supersonicairplane = new SupersonicAirplane();
				supersonicairplane.fly();
				supersonicairplane.flyMode = SupersonicAirplane.SUPERSONIC;
				supersonicairplane.fly();
			}
}
