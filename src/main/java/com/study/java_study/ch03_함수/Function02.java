package com.study.java_study.ch03_함수;

public class Function02 {

    // 매개변수 없고, 리턴도 없는 경우
    void fx01() {
        System.out.println("fx01함수 호출");

    }

    // 매개변수가 있고, 리턴이 없는 경우
    void fx02(int num1, int num2) {                 // fx02값을 호출할 때 2개의 인자를 넣을 수 있음
        System.out.println("fx02 함수 호출");
        System.out.println("num1 : " + num1);       // 문자열은 최상위 단위. 문자열과 어떤것을 더하면 문자열이 된다. 이 특징이 활용된 것
        System.out.println("num2 : " + num2);
    }


    String 빙수만들기(String 재료, int count) {
        return 재료 + "빙수 : " + count + "개";      // 리턴 자료형이 String이기 때문에 문자열로 return 해줘야 한다
    }
}
