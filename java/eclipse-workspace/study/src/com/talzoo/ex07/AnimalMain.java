package com.talzoo.ex07;

public class AnimalMain {
    public static void main(String[] args) { // 만약 main이 public이 아니라면 접근 못함. static은 아무것도 없을 때 작동해야 되니까. 
        // JVM 1) class loader: byte code -> method 영역, static만 그 중 static 영역에 올림 2) main thread 기동: static 영역 뒤져서 ~~~~main method 찾아서 실행
        Bird bird = new Bird();
        Dog dog = new Dog();

        Animal jindoDog = new Dog();
        Animal sparrow = new Bird();

        bird.sound();
        dog.sound();
        bird.live();
        dog.live();

        System.out.println("=====================");

        jindoDog.sound();
        sparrow.sound();
        jindoDog.live();
        sparrow.live();

        System.out.println("=====================");

        animalSound(new Dog());
        animalSound(new Bird());
        animalLive(new Dog());
        animalLive(new Bird());
    }

    public static void animalSound(Animal animal) { // 매개변수 polymorphism // main에서 부르는 메소드는 전부 static이어야 함
        animal.sound();
    }

    public static void animalLive(Animal animal) {
        animal.live();
    }
}
