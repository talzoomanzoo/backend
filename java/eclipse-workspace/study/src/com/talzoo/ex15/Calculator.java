package com.talzoo.ex15;


public class Calculator {
    private int memory;
    /* private String a = new String(); */
    /* private int [] a = {1,2,3,4,5};
    private int a = 1; // 안됨 - 레퍼런스를 가지고 있지 않아서*/

    public int getMemory() {
        return memory;
    }

    /* public synchronized void setMemory(int memory) { // symchronized: 하나의 thread가 진입하는 순간 입구를 막고 탈출하는 순간 열어줌
        this.memory = memory;

        try {
            Thread.sleep(2000);
        } catch (Exception e) {
            // TODO: handle exception
        }

        System.out.println(Thread.currentThread().getName() + ":" + this.memory);
        // this.memory = (임계영역 or Critical Section) 1개만 들어올 수 있음
    } */

        public void setMemory(int memory) { // symchronized: 하나의 thread가 진입하는 순간 입구를 막고 탈출하는 순간 열어줌
        // this 대신 a도 가능
        synchronized (this) { // synchronized block: synchronized (유일하게 식별되는 객체 레퍼런스): this라는 자기 자신을 가리키는 객체 레퍼런스
            this.memory = memory; 

            try {
                Thread.sleep(2000);
            } catch (Exception e) {
                // TODO: handle exception
            }

            System.out.println(Thread.currentThread().getName() + ":" + this.memory);
            // this.memory = (임계영역 or Critical Section) 1개만 들어올 수 있음
        }
    }
}
