package com.study.java_study.ch13_추상화04;

import java.util.ArrayList;
import java.util.List;

public class ClassAMain {

    public static void main(String[] args) {
        ClassA a1 = new ClassA1();      // 업캐스팅
        ClassA a2 = new ClassA2();      // 업캐스팅
        InterfaceA i1 = new InterfaceA1(); // 업
        InterfaceA i2 = new InterfaceA2(); // 업


        a1.print(i1);                   // a1 안에 들어있는 print는
        System.out.println();
        a1.print(i2);
        System.out.println();
        a2.print(i1);
        System.out.println();
        a2.print(i2);

    }
}
