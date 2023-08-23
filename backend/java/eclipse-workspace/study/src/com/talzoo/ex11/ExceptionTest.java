package com.talzoo.ex11;

public class ExceptionTest {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};

        try {
            System.out.println(arr[3]); // exception; runtime exception; NullPointerException
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("미안");
        } finally { // 하드웨어 잡고 하다가 오류 -> 해제를 위해 (자원 놓아주기)
            System.out.println("무조건 실행");
        }
        // String[] arr = {"null", "null", "null"}

        

        /* String data1 = args[0];
        String data2 = args[1];

        System.out.println(data1);
        System.out.println(data2); // exception; runtime exception; ArrayIndexOutOfBoundsException: args 선언 안해서 길이가 0인 array */

        /* try {
             Class c = Class.forName("java.lang.String2"); // 초기가 아니라 중간에 JVM이 클래스 올리기 -> java.lang에 없는 클래스 String2
        // compiler가 check해줘서 빨간 줄 (unhandled exception): 일반예외
        } catch (Exception e) { // 발생한 exception 객체의 referenece를 e가 잡음
            // TODO: handle exception
            System.out.println("오류네~~~~~~~");
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    } */

    }

}