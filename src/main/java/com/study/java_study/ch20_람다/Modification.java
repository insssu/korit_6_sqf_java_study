package com.study.java_study.ch20_람다;

    /*
        람다 ( Lambda )
        1. '하나'의 추상 메소드를 정의하고 있는 '인터페이스'에서 사용한다.
        2. 매개변수의 타입을 생략 할 수 있다.
        3. 매개변수가 '하나'이면 매개변수를 감싸는 () 괄호를 생략 할 수 있다. 매개변수가 없어서도 안됨
        4. 다른 명령 없이 바로 리턴만 한다면 메소드를 정의하는
            {} 중괄호와 return 키워드를 생략 할 수 있다. = if나 for문 같은 경우.

    */


@FunctionalInterface // 함수형 인터페이스 이다. 하나의 메소드만 정의할 수 있게 만들어 주는 @FunctionalInterface => 람다 전용 인터페이스
public interface Modification<T> {
    T modify(T oldData, T newData);
   // T modify2(T oldData, T newData); 두개를 재정의 할 수 없음. 누구를 재정의 할 지 모르기 때문에

}
