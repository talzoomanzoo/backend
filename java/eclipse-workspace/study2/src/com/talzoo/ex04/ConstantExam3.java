package com.talzoo.ex04;

public class ConstantExam3 { // 상수를 interface를 이용하여 grouping but human error check 불가
    public static void main(String[] args) {
        int day = Day.MONDAY;
		
		switch (day) {
		case Day.MONDAY:
			System.out.println("It's Monday.");
			break;
		case Day.TUESDAY:
			System.out.println("It's Tuesday.");
			break;
		case Day.WEDNESDAY:
			System.out.println("It's Wednesday.");
			break;
		case Day.THURSDAY:
			System.out.println("It's Thursday.");
			break;
		case Day.FRIDAY:
			System.out.println("It's Friday.");
			break;
		case Day.SATURDAY:
			System.out.println("It's Saturday.");
			break;
		default:
			System.out.println("It's Sunday.");
		}

		//if (Day.MONDAY == Month.JULY) {

		//}
    }
}
