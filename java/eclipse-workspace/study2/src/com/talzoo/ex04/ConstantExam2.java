package com.talzoo.ex04;

public class ConstantExam2 { // 가독성은 좋지만 grouping X
    private static final int MONDAY = 1;
    private static final int TUESDAY = 2;
    private static final int WEDNESDAY = 3;
    private static final int THURSDAY = 4;
    private static final int FRIDAY = 5;
    private static final int SATURDAY = 6;
    private static final int SUNDAY = 7;

    public static void main(String[] args) {
        int day = MONDAY;

        switch (day) {
            case MONDAY:
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
    }
}
