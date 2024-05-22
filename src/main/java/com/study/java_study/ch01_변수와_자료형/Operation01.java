package com.study.java_study.ch01_변수와_자료형;

public class Operation01 {
    public static void main(String[] args) {
        // 연산자

        // 산술연산자
        int num1 = 10 + 20;
        int num2 = 9 / 2 ;    // incompatible types: possible lossy conversion from double to int
        System.out.println(num2);
        int num3 = 9 % 2;
        System.out.println(num3);
       // int num4 = ? % 2 ;  2의 배수인지 ( or 짝 홀 인지 )
       //          = ? % 3 ;  0으로 떨어지면 3의 배수
        boolean num4 = 5 % 2 == 0;
        System.out.println(num4);

        System.out.println("//////////////////////");

        // 증감연산
        int i = 0;                      // 출생신고는 두번 안하듯이 선언을 하면 메모리를 저장
        // int i = 10;                     -> variable i is already defined in method main(java.lang.String[])
        System.out.println(i);          // 변수명은 메모리 주소를 할당하는 것
        i++;
        System.out.println(i);
        i = i + 1;
        System.out.println(i);
        ++i;        //
        System.out.println(i);    // 3
        System.out.println(++i);  // 4   선증가
        System.out.println(i++);  // 4   명명이 끝나고 나면 증가함 후증가
        System.out.println(i);    // 5
        System.out.println(--i);  //4
        System.out.println(i--);  //4
        System.out.println(i);    //3

        // 논리연산자
        // true => 1
        // false => 0
        // && => AND(곱) -> 모든 조건을 만족해야 하는 경우
        // || => OR(합)  Shift + 엔터위 '\' -> '~이거나', '~중에 하나만 만족하면'
        // ! => NOT(부정)
        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(true || true);   // 0이 아니면 true
        System.out.println(false && false);
        System.out.println(false || false);
        System.out.println(!true && true);
        System.out.println("//////////////////////");

        // 관계연산자
        System.out.println(3 > 2 && 1 == 1);
        System.out.println(1 != 1);

        // 조건연산자
        System.out.println(3 > 2 ? 10 : 20);         // 삼항연산자 1. 3>2 2. 10 3. 20 / 연산자 -> ?
        int x = 10;                                  // 삼항연산자는 자료형을 일치시켜 주어야 한다.
        int y = 2;
        String result = x % y == 0 ? "y의 배수입니다." : "y의 배수가 아닙니다.";
        System.out.println(result);

        String result2 = "" + 10/2;

        // 복합대입연산자
        int number = 10;
        number += 5;            // number = number + 5;  -> 나 자신에게 + 연산자를 실행해라
        number -= 1;
        number *= 2;
        number /= 2;
        number %= 2;




    }
}
