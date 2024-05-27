package com.study.java_study.ch07_클래스02;

public class StudyMain {

    public static void main(String[] args) {
        StudyA a = new StudyA(100, 1000);   // 생성할 때 깡통으로 만들것이냐(StudyA()),
                                            // 값을 넣어줄 것이냐(StudyA(100, 1000))

       //생성자를 대입   생성자 호출
        System.out.println(a);          // @49e4cb85 주소값이 입력된다.
        System.out.println(a.num);
        System.out.println(a.num2);

    }
}
