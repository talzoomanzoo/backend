package com.talzoo.ex02;

public class Watch {
    public static String company = "Rolex";
    public static String model = "Oyster Precision";
    public static String feature;

    static { //static 정보를 모두 올린 후 실행
        feature = company + "-" + model + "limited edition";
    }
}
