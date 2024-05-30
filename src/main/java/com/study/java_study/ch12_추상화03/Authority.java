package com.study.java_study.ch12_추상화03;
/*
    인터페이스
    1. 일반 클래스와 동일하게 정의 할 수 없다.
    2. 일반 변수(멤버변수)를 정의 할 수 없다. - 변수를 못쓴다.
    3. 무조건 상수만 정의 할 수 있다.
    4. 일반 메소드(멤버메소드)를 정의하기 위해서는 default 키워드를 사용하여야 한다. (실행할 수 있는 메소드)
    5. 추상 메소드를 정의 할 때 abstract 키워드를 생략할 수 있다.
    6. 인터페이스 안에 정의되어 지는 모든 상수와 메소드들은 public 접근 지정자를 사용한다.


    기능을 구현하겠다 -> 클래스
    기능적인 부분은 인터페이스로 구현, 화면을 출력할 수 있는 기계는 모니터, TV등이 있는데 이는 구체화해서 만든 추상클래스. 전원을 공급한다는 것 자체는 추상적인 의미
    인터페이스는 넓은 범위(전원을 공급한다.), 추상클래스는 기계의 종류.

*/

public interface Authority {

    // public static final 생략
    String DEFAULT_ROLE = "ROLE_USER";      //String DEFAULT_ROLE = "ROLE_USER"; 인터페이스 안에서는 이것도 상수가 된다.
// = public String DEFAULT_ROLE = "ROLE_USER";
// = public static final DEFAULT_ROLE = "ROLE_USER";

    // public abstract 생략
    String getAuthority();

    // public 생략 가능
    public default void printAuthority() {          // 4. 일반 메소드(멤버메소드)를 정의하기 위해서는 default 키워드를 사용하여야 한다.
        System.out.println(DEFAULT_ROLE);           // 이렇게 되면 다른 일반 클래스에서 실행하는것 처럼 할 수 있다.
    }

}
