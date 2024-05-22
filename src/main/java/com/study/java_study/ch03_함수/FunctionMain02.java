package com.study.java_study.ch03_함수;

public class FunctionMain02 {

    public static void main(String[] args) {
        Function02 fx = new Function02();           // 메인(Functionmain)이 먼저 실행되고 Function02에 있는 fx01함수가 존재한다.
        // 자료형 /변수명/    객체 생성                    fx01이 정의되어 있는 부분은 Function02

        fx.fx01();
        fx.fx02(10, 20);
        fx.fx02(100, 200);

        System.out.println(fx.빙수만들기("딸기", 10) + " 주문 완료");
        String 빙수 = fx.빙수만들기("초코", 5);
        System.out.println(빙수);

    }
}
