package com.study.java_study.ch02_클래스01;

public class ObjectMain {

    public static void main(String[] args) {

        int a = 10;  // 사람이 보기에는 10 이지만 컴퓨터는 2진수로 보이듯이 변수 자체의 값을 주소로 정해둠 -> 리터럴 상수(기본 자료형은 int)
        ObjectA objectA1 = new ObjectA(); // 100번  , class명 : ObjectA , 변수 : objectA 변수는 무조건 소문자로 시작한다
        // new 를 통해 새로운 자료형을 만들어 주겠다 선언하는 것.
        ObjectA objectA2 = new ObjectA(); // 200번 , 우리가 만든 class도 자료형이다


        System.out.println(a);
        System.out.println(objectA1);
        System.out.println(objectA2);

        objectA1.num = 20;
        objectA2.num = 30;

        System.out.println(objectA1.num);
        System.out.println(objectA2.num);

        System.out.println(objectA1.name); // null은 크기도 자료도 없는 아무것도 없는 상태를 말함




    }
}
