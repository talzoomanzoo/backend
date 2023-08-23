package com.talzoo.control;

public class IfTest {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int num = (int) (Math.random() * 6) + 1; // 0.0 ~ 5.999999999999 (0.999999999 * 6) -> 1 ~ 5 -> 1 ~ 6

        if (num == 1) {
            System.out.println("1번");
        } else if (num == 2) {
            System.out.println("2번");
        } else if (num == 3) {
            System.out.println("3번");
        } else if (num == 4) {
            System.out.println("4번");
        } else if (num == 4) {
            System.out.println("5번");
        } else {
            System.out.println("6번");
        }
        System.out.println("===========================");
        num = (int) (Math.random() * 6) + 1;

        switch(num) {
        case 1:
            System.out.println("1번");
            break; // break 없으면 1~6까지 다 뽑음
        case 2: 
            System.out.println("2번");
            break;
        case 3:
            System.out.println("3번");
            break;
        case 4:
            System.out.println("4번");
            break;
        case 5:
            System.out.println("5번");
            break;
        default:
            System.out.println("6번");
        }
        
        System.out.println("============================");
        char ch = 'y';

        switch(ch) { //byte chr int short long 인 정수타입만 switch 뒤에 올 수 있음 + String
        case 'y':
        case 'Y':
            System.out.println("진행~");
            break; 
        case 'n':
        case 'N':
            System.out.println("중지");
            break;
        default:
            System.out.println("잘못선택");
        }
    }
}
