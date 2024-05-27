package com.study.java_study.ch07_클래스02;

public class StudyA {
    int num;
    int num2;

    //생성자
    //1. 클래스 명과 동일하다.
    //2. 리턴 자료형이 없다.
    //3. 생성자는 무조건 할당된 메모리의 주소를 리턴한다.

    // NoArgsConstructor 매개변수가 없는 생성자.
    StudyA() {
        System.out.println("스터디 에이 객체 생성");
    }

    //AllargsConstructor 생성자(StudyA)에 매개변수(int num, int num2)가 있는 것.
    StudyA(int num, int num2) {                          // 값이 들어가져 있는 생성자를 만들 수 있을까? 했을때
    //StudyA()는 생성자 이름이면서 자료형이다. 따라서 StudyMain에서 StudyA a에 대입이 될 수 있다.
        System.out.println("스터디 에이 객체 생성");
        this.num = num;
        this.num2 = num2;
    }

    void increase(int increaseNum) {   // 빙수기계<
        num += increaseNum;            // void는 빙수기계에서 빙수를 갈았지만 값을 주지 않는 것.
        num2 += (increaseNum * 2);
    }

    void decrease(int decreaseNum) {
        num -= decreaseNum;
        num2 -= (decreaseNum * 2);
    }
}
