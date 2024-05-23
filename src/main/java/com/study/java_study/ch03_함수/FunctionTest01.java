package com.study.java_study.ch03_함수;

public class FunctionTest01 {

    int fx01_1() {
        return 10;
    }
    int fx01_2() {
        return 20;
    }

    void printResult() {
        FunctionTest02 functionTest02 = new FunctionTest02();
        System.out.println(functionTest02.getAddData(fx01_1(), fx01_2())); // 같은 클래스(주소) 안에 있는건 참조를 안해도 됨. 바로 찾아올 수 있잖아
    }                                        //return   10   ,    20
                    // 결과의 functionTest03.add값을 받아와서 30
                                            // 주소가 다르니 참조를 할 필요가 있는 것
}
