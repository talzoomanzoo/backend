package com.talzoo.ex16;

public class BoxMain {
    public static void main(String[] args) {
        Box box = new Box();

        box.setObject("홍길동");
        String name = (String) box.getObject();
        System.out.println(name);

        box.setObject(new BoxMain());
        BoxMain boxMain = (BoxMain) box.getObject();
        System.out.println(boxMain);
    }
}
