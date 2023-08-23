package com.talzoo.ex01;

public class Car {
    //field != 변수 (class의 멤버는 field, method의 멤버는 변수)
    String company = "Volvo";
    String model = "V90 Cross Country";
    String color = "black";
    int horsePower = 250; //field는 stack에 안들어감 (stack은 로컬변수만 처리)

    public Car() { // 추가 생성자가 있는 경우 기본 default 생성자 수동으로 추가해 주어야 함

    }
    public Car(String color) { //생성자: return 타입 자체가 존재하지 않음
        this(color, "V90 Cross Country", 250); //필드의 color vs. 파라미터의 color //같은 네임 color 안써도 되지만 this 사용해서 field 바로 보는 게 java 표기법

    } // 생성자 overloading: 생성자를 두 개 이상 구현하는 경우

    public Car(String color, String model) {
        this(color, model, 250);
    }

    public Car(String color, String model, int horsePower) {
        this.color = color;
        this.model = model;
        this.horsePower = horsePower;
    }

    /* public Car(String model, String color) {
        this.color = color;
        this.model = model;
    } */ // String String이라서 동일한 생성자라서 오류

    public Car(String model, int horsePower) {
        this.color = model;
        this.horsePower = horsePower;
    }

    public Car(int horsePower, String model) {
        this.color = model;
        this.horsePower = horsePower;
    } // String int, int String이라서 compiler가 다른 생성자라고 봄

    public void ShowSpec() { //메서드: 항상 return 타입이 있음
        System.out.println("Company: " + company);
        System.out.println("Model: " + model);
        System.out.println("Color: " + color);
        System.out.println("Power: " + horsePower);
        System.out.println("this: " + this);
    }
}
