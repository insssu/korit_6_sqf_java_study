package com.study.java_study.ch19_익명클래스;

public class KeyMain {
    public static void main(String[] args) {

        Key attackKey = new AttackKey();
        attackKey.onKeyDown();
        attackKey.onKeyUp();

        Key customKey = new Key() {         // {}에서 정의된 내용을 Key 인터페이스에서 바로 생성
            @Override                       // 캐릭터의 커스텀키를 만들어 사용자가 임의로 키를 구성할 때 한 번 쓰고 말 키이므로 익명클래스로 정의해서 작동.
            public void onKeyUp() {
                System.out.println("커스텀키 뗌");
            }

            @Override
            public void onKeyDown() {
                System.out.println("커스텀키 누름");
            }
        };// 인터페이스를 만든 적 없지만 바로 생성 할것이다. 클래스 파일을 따로 만들지 않고 정의해서 바로 생성하겠다.

        customKey.onKeyDown();
        customKey.onKeyUp();

    }
}
