package com.study.java_study.ch18_빌더;

public class Main {

    public static void main(String[] args) {
        // 내부 클래스
        A a = new A();
        A.B b = a.new B();      // a 라는 클래스 안에 있는 B라는 생성자를 호출하겠다.
        // B라는 클래스는 A라는 클래스 안에 있는 것. A 클래스가 먼저 생성되어져야 B클래스가 생성될 수 있다.

        a.test();
        b.print();

        A.C c = new A.C();      // A를 새로 생성하지 않아도 C를 호출할 수 있다. C가 Static 이기 때문에.
        c.show();               // show는 static이 아니기 때문에 c를 생성해서 호출

        A.C.show2();            // show2 는 static 이므로 바로 호출 할 수 있다.
    }
}
