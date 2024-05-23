package com.study.java_study.ch03_함수;

public class Function03 {
    void fx01(int studentCode, String name, int age, String phone) {


        System.out.println("fx01 함수 호출");
        System.out.println(studentCode);
        System.out.println(name);
        System.out.println(age);
        System.out.println(phone);
        System.out.println();
    }

    void fx02(Student i) {
         //    변수
        System.out.println("fx02 함수 호출");
        System.out.println(i.studentCode);
        System.out.println(i.name);
        System.out.println(i.age);
        System.out.println(i.phone);

    }
}
