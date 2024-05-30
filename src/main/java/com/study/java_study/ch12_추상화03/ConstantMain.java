package com.study.java_study.ch12_추상화03;

public class ConstantMain {
    /*
        상수
        1. 선언과 초기화를 잘 구분해야 한다.
        2. 선언 이후에 한 번 이라도 초기화(최초 대입)가 되면 그 다음 부터는 다른 값으로 변경 할 수 없다.
        3. 상수는 가능한 대문자로 표기한다.
        4. 모든 상수명이 대문자이기 때문에 스네이크 표기법을 사용한다. 단어간의 구분이 안되기 때문.

    */
    public static void main(String[] args) {

        // 상수
        int a = 10;
        a = 20;         // 변수안에 주솟값을 바꿀 수 있다.

        final int B;
        B = 30;         // 초기화(최초 대입)가 된 것.
       // B = 40;

       /* final int b = 30;   // final = 상수 정의 , 30이 대입된 것 : 초기화
        //b = 40;*/

    }
}
