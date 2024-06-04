package com.study.java_study.ch20_람다;

public class AdditionMain {

    public static void main(String[] args) {

        Addition addition = new Addition() {
            @Override
            public int add(int x, int y) {
                return x + y;
            }
        };

        int result = addition.add(10, 20);
        System.out.println("결과 : " + result);

        Addition addition2 = ((x, y) -> x + y);     // class 를 '생성'하고 '정의'하는 것을 한줄로 표현한 것이 람다식
        result = addition2.add(10, 20);
        System.out.println("결과 2 : " + result);
    }
}
