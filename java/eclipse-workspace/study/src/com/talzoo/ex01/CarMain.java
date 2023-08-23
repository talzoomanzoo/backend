package com.talzoo.ex01;

public class CarMain {
    public static void main(String[] args) {
        Car car1 = new Car(); // new (객체를 만들고 그것의 레퍼런스를 return 하는 연산자) / 자바는 절대 실제 주소값을 노출하지 않는다 
        car1.ShowSpec(); //this: 객체레퍼런스 값이 할당되는 자바의 특별한 기능
        System.out.println(car1.company);

        Car car2 = new Car();
        System.out.println(car1); //println(객체): 클래스의 패키징명을 포함한 클래스명과 객체 식별값까지 알려줌 (this와 같다)
        System.out.println(car2);
        System.out.println("================");

        Car car3 = new Car("white"); // new + 생성자 호출 시 해당 생성자 실행; 생성자 실행 완료 시 heap 영역에 객체 생성됨; 생성자가 없으면 public Car()() <- default 생성자 compiler가 집어넣음
        car3.ShowSpec();

        Car car4 = new Car("red");
        car4.ShowSpec();

        Car car5 = new Car("blue", "V60");
        car5.ShowSpec();
    }
}
