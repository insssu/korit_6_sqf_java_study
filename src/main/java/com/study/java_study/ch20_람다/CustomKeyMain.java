package com.study.java_study.ch20_람다;

import com.study.java_study.ch19_익명클래스.AttackKey;

public class CustomKeyMain {
    public static void main(String[] args) {
        CustomKey attackKey = new CustomKey() {
            @Override
            public void onKeyPress() {
                System.out.println("공격키 누름");
            }
        };

        attackKey.onKeyPress();

        CustomKey skillKey = () -> {        // 하나의 추상 메소드만을 가져야지 가능하다.
            System.out.println("스킬키 누름"); // CustomKey 인터페이스 에서 메소드 하나
        };

        skillKey.onKeyPress();
    }
}
