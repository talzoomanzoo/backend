package com.talzoo.ex02;

public class StaticAlert {
    int field1;
    public void method1() {

    }

    static int field2;
    public static void method2() {

    }

    static {
/*         field1 = 10;
        method1(); */ //인스턴스 멤버는 static member를 넣을 수 없다
        field2 = 10;
        method2(); 
    }

/*     public static void method3() { //메소드는 리턴 타입 적어야 함
        this.field2 = 20;
        this.method2();
    } */  //객체 생성 전에 사용되는 메서드인데 this는 객체 생성 후에 만들 수 있는 것임

    public static void method4() {
        StaticAlert s = new StaticAlert();
        s.field1 = 10;
        s.method1();
    }
}
