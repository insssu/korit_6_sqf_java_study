package com.study.java_study.ch05_입력;

import java.sql.NClob;
import java.util.Scanner;

public class 입력01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);                         // Scanner은 Ctrl + space를 누른 후 import를 생성해서 사용해줘야 한다.
        System.out.print("a: ");
        //String a = scanner.next();                                      // next 매개변수는 String을 리턴한다. nextInt는 Int 자료형을 리턴한다.
        /*
            next() 메소드 특징
            1. 공백과 줄바꿈(엔터)은 무시한다.
            2. 버퍼를 사용한다. 버퍼란
         */
        String a = scanner.next();                                        // python의 input 개념?
        System.out.println("에이 : " + a);

        System.out.print("b: ");
        String b = scanner.nextLine();                                    // nextLine(); 은 스페이스바를 포함한다. 엔터에서 끊음
        System.out.println("비 : " + b);
    }
}
