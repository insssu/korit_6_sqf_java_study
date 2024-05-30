package com.study.java_study.ch13_추상화04;

public class ClassA1 extends ClassA {

    @Override // @Override 부모가 가지고 있는 것을 재 정의하는 것
    public void print(InterfaceA interfaceA) {       // 외부에서 객체(interfaceA 자리)가 주입이 됨. print가 interfaceA객체를 의존한다. interfaceA가 있어야지만 실행이 되니까. Dependancing Indection
        System.out.println("A1 클래스에서 print 호출");
        interfaceA.test();
    }

}
