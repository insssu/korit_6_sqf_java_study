package com.study.java_study.ch09_클래스04;

public class BookMain {

    public static void main(String[] args) {
        BookService bookService = new BookService();

        System.out.println("프로그램을 실행합니다.");

        while(bookService.run()) {}                            // 반복해라. 북서비스의. 참이면. 런이. 계속된다. 거짓이면 멈춘다.
                                                               // while문이 반복될 때 마다 조건문이 호출되어 실행이 된다.
        System.out.println("프로그램을 종료합니다.");             // while이 끝나면 '종료합니다'
    }
}
