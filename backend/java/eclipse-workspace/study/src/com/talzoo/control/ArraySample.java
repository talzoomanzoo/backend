package com.talzoo.control;

public class ArraySample {
    public static void main(String[] args) { // main method 실행 전에 os가 넘겨줌
        if(args.length != 2) {
            System.out.println("Usage: 클래스명 매개변수1 매개변수2" );
            System.exit(0); //시스템 정상종료
        }

        System.out.println("니가 입력한 값은: " + args[0] + "와 " + args[1] + "입니다."); //main method 끝나면 정상 종료 되니까 필요 x
    }
}