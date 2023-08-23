package com.talzoo.control;

public class ForTest {
    public static void main(String[] args) {
        int num = 10;
        ++num; // num = num+ , num +=1
        System.out.println(num);
        num++;
        System.out.println(num);
        int num2 = 20 + ++num; // 본인이 속한 실행문장을 실행하기 전에 더함
        System.out.println(num + "-" + num2);
        num2 = 20 + num++; // 본인이 속한 실행문장을 실행한 후에 더함
        System.out.println(num + "-" + num2);
        System.out.println("=======================");

        int sum = 0;
        for(int i = 1; i <= 100; i++) {  // 1 -> 2 -> 4 -> 3 -> 2 -> 4 -> 3 ...
            sum+= i;
        }
        System.out.println(sum);
        System.out.println("=======================");

        sum = 0;
        int i = 1;
        for (; i<= 100; i++) {
            sum += i;
        }
        System.out.println(sum);
        System.out.println("=======================");


        i = 1;
        int j = 10;
        for (; i<= 100; i++, j++) {
            sum += i;
        }
        System.out.println(sum);
        System.out.println("j = " + j);
        System.out.println("=======================");

        // for(;;) {
            // sum += 0;
        }
    }
