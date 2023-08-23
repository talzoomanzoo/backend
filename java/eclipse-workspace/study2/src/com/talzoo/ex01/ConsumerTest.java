package com.talzoo.ex01;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.ObjIntConsumer;

public class ConsumerTest { // 모든 추상메소드 이름이 .accept (무엇이든 받아들여서 소비)
    public static void main(String[] args) {
        Consumer<String> consumer = t -> System.out.println(t + "Class"); // interface 제공하니까 객체 알아서 만들어서 써라
        consumer.accept("Java");

        Consumer<String> consumer2 = new Consumer<String>() {

            @Override
            public void accept(String t) {
                // TODO Auto-generated method stub
                System.out.println(t + "Class");
            }
            
        };
        consumer2.accept("Java");

        BiConsumer<String, String> biConsumer = (t, u) -> System.out.println(t + u);
        biConsumer.accept("Java", "Class");

        DoubleConsumer doubleConsumer = d -> System.out.println(d + "를 10으로 나눈 나머지는 " + d % 10 + "입니다.");
		doubleConsumer.accept(14.0);
		
		ObjIntConsumer<String> objIntConsumer = (t, i) -> System.out.println(t + i); // t, int value
        objIntConsumer.accept("Java", 8);
    }
}
