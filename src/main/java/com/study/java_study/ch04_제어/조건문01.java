package com.study.java_study.ch04_제어;

public class 조건문01 {

    public static void main(String[] args) {
        // 1. if, else if, else
        // 2. switch, case, default
        // 3. continue, break

        if(false) {
            System.out.println("참입니다.");
        } else {        // else는 되도록 안쓰는 코드를 작성할 수 있도록 하자
            System.out.println("거짓입니다.");
        }

        int num = 100;
        if(num % 2 == 0 && num % 10 == 0) {
            System.out.println("짝수입니다.");
        } else {
            System.out.println("홀수입니다.");
        }


        if(num % 2 == 0)
            System.out.println("2의 배수 입니다.");
            System.out.println("2의 배수 입니다.");
        // 중괄호를 묶는 이유는 여기부터 여기까지는 하나야 ! 라는 의미인데,
        // 명령이 하나밖에 없다면 중괄호를 생략할 수 있다.

        if(num % 2 == 0) {
            System.out.println("2의 배수 입니다.");
        } else if(num % 3 == 0) {
            System.out.println("3의 배수 입니다.");
        } else if(num % 7 == 0) {
            System.out.println("7의 배수 입니다.");
        }  else {
            System.out.println("2의 배수도 아니고 3의 배수도 아니다.");
        }




    }
}
