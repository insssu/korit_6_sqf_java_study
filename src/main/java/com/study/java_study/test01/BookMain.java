package com.study.java_study.test01;

public class BookMain {
    public static void main(String[] args) {
        BookService bookService = new BookService();

        System.out.println("프로그램을 실행합니다.");

        while(bookService.run()) {}

        System.out.println("프로그램을 종료합니다.");
    }
}
