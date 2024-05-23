package com.study.java_study.ch04_제어;

public class 조건문02 {
    public static void main(String[] args) {
        String text = new String("");
        String name = "인수";       // 값의 자료형이 String이지만
        String phone = "010101010101";    // 값의 자료형이 null 이다.
        // 문자열(String)은 큰따옴표와 null 둘 다 비어있는 값이지만 둘은 엄연히 다르다.

        StringUtils stringUtils = new StringUtils();  // 단일책임원칙. 하나의 식에서 하나의 값만을 도출해 내는 함수. 중요.

        if (stringUtils.isEmpty(name)) {
            System.out.println("name이 비어있습니다.");
            return;                                     // 함수의 결과를 돌려주는 역할이므로 위의 값이 참일경우 함수를 종료해라.
        }                                                // 위 함수가 false일 경우 아래 함수로 이동.

        if(stringUtils.isEmpty(phone)) {
            System.out.println("phone이 비어있습니다.");
            return;
        }

        if(stringUtils.isEmpty(text)) {             // 등호는 주소값 비교이므로 text가 null의 주소를 가질 때 text == "" 와는 다른 주소를 가지므로 if문이 거짓이라 실행했을 때 출력되지 않는다.
            System.out.println("text이 비어있습니다.");
            return;
        }                                           // 함수의 리턴 자료형이 void 일때만 리턴값을 비워둘 수 있다. 함수가 실행되어져 가다가 중간에 끊어라는 의미


    }
}
