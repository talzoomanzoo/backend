package com.talzoo.ex18;
// generic class: 타입 변수를 class 이름 뒤에,generic method는 return 타입 앞에
public class Util {
    public static <T extends Number> int compare(T t1, T t2) { // Wrapper Type객체로 자동 autoboxing
        // Number 기본 제공 (T는 number 라는 타입이거나, 그것의 자식 타입이거나, 구현클래스이거나)
        // t1, t2  (타입 파라미터 변수) 는 T (상위 타입)상속
        double v1 = t1.doubleValue(); // Number가 가지고 있는 메소드 (double 타입으로 바꿔줌)
        double v2 = t2.doubleValue();
        return Double.compare(v1, v2); // (왼쪽에서 오른쪽 뺀다) 두개가 같으면 0을 return, 후자가 작으면 1, 전자가 작으면 -1 return
    }
}
