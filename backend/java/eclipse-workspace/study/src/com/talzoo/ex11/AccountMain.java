package com.talzoo.ex11;

public class AccountMain {
    public static void main(String[] args) {
        Account acc = new Account();

        acc.deposit(10000);
        System.out.println(acc.getBalance());
        
        try {
            acc.withdraw(50000);
        } catch (BalanceInsufficientException e) { // 스택에는 있고 heap에 있는 예외 객체를 try- catch로 레퍼런스 해줌
            // TODO: handle exception
            System.out.println(e.getMessage()); // .getMessage from Exception or RuntimeException
            System.out.println();
            e.printStackTrace(); // exception 객체의 package 명까지 포함한 fullname
        }
        
    }
}
