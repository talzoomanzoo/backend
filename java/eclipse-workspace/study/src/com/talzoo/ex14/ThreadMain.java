package com.talzoo.ex14;

public class ThreadMain {
    public static void main(String[] args) {
        Thread mainThread = Thread.currentThread(); // 현재 여기를 실행하고 있는 thread 객체의 reference를 가져옴 (main thread는 main method밖에 못실행시킴)
        System.out.println("main method 실행 " + mainThread.getName()); // 원래 이름이 main

        ThreadA threadA = new ThreadA();
        System.out.println("ThreadA 실행 " + threadA.getName()); // setName threadA라서
        threadA.start();

        ThreadB threadB = new ThreadB();
        System.out.println("ThreadB 실행 " + threadB.getName()); // setName  안해서 자동
        threadB.start();
    }
}
