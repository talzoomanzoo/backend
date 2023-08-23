package com.talzoo.ex11;

public class Account {
    private long balance;

    public long getBalance() {
        return balance;
    }

    public void deposit(int money) {
        balance += money;
    }

    public void withdraw(int money) throws BalanceInsufficientException{ // 클래스가 아니라 타입을 던진다 
        if(balance < money) {
            throw new BalanceInsufficientException("잔고부족"); // 새로운 예외객체 생성 vs throws 예외객체 자기를 호출한 메소드로 넘기기
        }
        balance -= money;
    }
}
