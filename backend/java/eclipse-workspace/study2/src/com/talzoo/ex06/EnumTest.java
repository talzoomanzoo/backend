package com.talzoo.ex06;

public class EnumTest { // Enum은 switch 문에 만들 수 있게 만든 특별한 타입의 클래스
    public static void main(String[] args) {
        Day day = Day.MONDAY;
		
		switch (day) {
		case MONDAY: // day. 생략 가능
			System.out.println("It's Monday.");
			break;
		case TUESDAY:
			System.out.println("It's Tuesday.");
			break;
		case WEDNESDAY:
			System.out.println("It's Wednesday.");
			break;
		case THURSDAY:
			System.out.println("It's Thursday.");
			break;
		case FRIDAY:
			System.out.println("It's Friday.");
			break;
		case SATURDAY:
			System.out.println("It's Saturday.");
			break;
		default:
			System.out.println("It's Sunday.");
		}

        // if (Day.FRIDAY == Month.MARCH) {} 서로 다른 클래스의 비교도 막아줌
    }
} // 서로 다른 enum 객체들이라서 case구분이 가능..?