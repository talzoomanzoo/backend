package com.talzoo.ex11;

public class ThrowsTest { // Throws 구문: 예외 발생했다고만 알려주고 사용하는 사람이 각자 어떻게 처리할지 재량에 맡길 수 있게 하려고
    public static void main(String[] args) {

        try {
            int[]arr = null;
            System.out.println(arr[3]); // A. NullPointerException
            test();
        } catch (Exception e) { // B. 자식 객체 레퍼런스 다 잡힘 ClassNotFoundException < Exception
            // TODO: handle exception
            System.out.println("예외 처리"); // 2. C. 던진 예외 여기서 처리됨
        }
    }

    public static void test() throws ClassNotFoundException { // 1. ClassNotFoundException 발생 시 나를 호출한 쪽으로 던져라
        Class c = Class.forName("java.lang.String2"); 
    }
}
