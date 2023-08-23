package com.talzoo.ex20;

public class LambdaMain {
    public static void main(String[] args) {
        /* NoParamNoReturn no = () -> {
            System.out.println("Hello");
        }; */

        /* NoParamNoReturn no = () -> System.out.println("Hello"); */ // 바디에 한줄 밖에 없을 때는 {} 생략 가능

        NoParamNoReturn no =  () -> System.out.println(NoParamNoReturn.MATHPI + 5);

        no.method();


        /* NoReturn no2 = (a) -> System.out.println(a * 2); */
        NoReturn no2 = a -> System.out.println(a * 2); // 입력 파라미터가 1개일 때는 괄호도 생략 가능
        no2.method(10);

        Doolda doolda = (x,y) -> {return x*y;};
       /*  Doolda doolda = (x,y) -> x*y; */ // return 문일때 중괄호 지워주고 싶으면 return도 지워줘야 함
        System.out.println(doolda.method(2, 5));
    }
}
