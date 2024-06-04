package com.study.java_study.ch16_제네릭;

import com.study.java_study.ch10_추상화01.Animal;

public class MessageMain {

    public static void main(String[] args) {
        // 제네릭 와일드 카드 : 기호 -> '?'       포커의 와일드 카드 => 조커 => 어떤 카드든 변할 수 있다 => Object => 모든 자료형을 포함
//                                            와일드 카드를 쓰기 위해선 다운캐스팅이 필요하다. 제네릭을 쓰면서 오브젝트를 쓰고싶다 할 때 와일드 카드를 사용.
//        int num;
//
//        num = 10;           // 초기화는 언제든지 생성 할 수 있다.
//      Message<Object>
        Message<?> m1;        // integer 외에 다른 자료형, 예를들어 String으로도 넣고 싶을 때는?
        Message<String> m2 = null;

        m1 = new Message<>("10");
//        String s = m1.getMessage(); 하기 위해서는 다운캐스팅이 필요하다. 따라서
        String s = (String) m1.getMessage(); // (String) 다운캐스팅 필요

        // 와일드 카드 제약
        Message<? extends String> m3 = new Message<>("10"); // 하행
        // String 클래스를 상속 받은 아이들 이거나 String 인 친구들 만
        // 와일드 카드로 들어올 수 있다는 뜻 = 자신을 기준(포함)으로 하행했다.
        //Message<? extends Animal> m5 = new Message<>("tiger");

        Message<? super String> m4 = new Message<>(new Object()); // 상행
        // 나 자신으로부터 위로는 가능. 하지만 형제는 안됨
        // tiger 이라는 아이는 animal에 속해있다 하지만 dog는 안된다. 는 느낌


        String s2 = m3.getMessage();





    }
}
