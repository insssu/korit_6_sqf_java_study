package com.study.java_study.ch19_익명클래스;

public class ButtonMain {

    public static void main(String[] args) {

        Button homeButton = new HomeButton();
        Button loginButton = new Button() {     // 인터페이스는 생성 못하지만 main에서 구현을 하도록 만들었다.
            @Override                           // 객체의 생성과 정의를 동시에 한 것.
            public void onClick() {
                System.out.println("로그인 하기");
            }
        };

        click(homeButton);
        click(loginButton);
    }

    public static void click(Button button) {
        System.out.println(button.getClass());
        button.onClick();

        /* 위를 실행 했을 경우
            class com.study.java_study.ch19_익명클래스.HomeButton
            홈으로 이동
            class com.study.java_study.ch19_익명클래스.ButtonMain$1  => $1 은 익명의 객체 하나가 생성되었다는 것을 의미한다.
            로그인 하기
         */
    }
}
