package com.talzoo.control;

import java.util.Scanner;

public class WhileTest {
    public static void main(String[] args) {
        int i = 101;
        int sum = 0;
        while(i <= 100) { // 조건 검색 먼저
            sum +=  i;
            i++;
        } //횟수 = while, 조건 = for
        System.out.println(sum);

        System.out.println("===================");

        sum = 0;
        i = 101;

        do {
            sum += 1; 
            i++; //실행 먼저
        } while(i <= 100); //여기서 실행이 끝남
        System.out.println(sum);

        System.out.println("==================");

        sum = 0;
        i = 1;

        do {
            sum += i;
            i++;
        } while(i<= 100);
        System.out.println(sum);
        
        String input;
        Scanner scanner = new Scanner(System.in); // keyboard 사용하겠다고 os에게 요청
        do {
            System.out.print(">");
            input = scanner.nextLine(); //next(): 문자열로 (토큰 기준으로 나눠짐, 버퍼에 토큰이 있으면 가져온다), nextLine(): 줄 기준
            System.out.println("==>" + input);
        } while(!input.equals("q"));
        scanner.close(); //os에서 할당받은 자원 eg. buffer nullify / os에서 할당받은 자원 != 자바 파티션 부분의 heap
        System.out.println("Game Over!");
    }
}