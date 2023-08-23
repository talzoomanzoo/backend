package com.talzoo.ex06;

public class GasolineEngine extends Engine {

    public GasolineEngine(int numOfCylinder, String oil) { 
        super(numOfCylinder, oil);  // 부모의 생성자 호출 // GasolineEngine 만들때 파라미터 받아서 부모 생성자 쪽으로 넘겨줌
        //TODO Auto-generated constructor stub
    }

    @Override
    public void runEngine() {
        // TODO Auto-generated method stub
        System.out.println("부르릉~~~~~~~~~");
    }
}
