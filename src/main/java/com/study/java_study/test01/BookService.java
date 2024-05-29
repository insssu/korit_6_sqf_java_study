package com.study.java_study.test01;

import java.util.Scanner;

public class BookService {

    private Scanner scanner;
    private BookRepository bookRepository;

    public BookService() {
        scanner = new Scanner(System.in);
        bookRepository = new BookRepository();
    }

    private String selectMenu() {
        String menus = "1234q";
        String selectedMenu = null;

        while (true) {
            System.out.print("메뉴 선택 : ");
            selectedMenu = scanner.nextLine();
            if (menus.contains(selectedMenu)) {
                break;
            }
            System.out.println("잘못된 입력입니다. 다시 입력하세요.");
        }
        return selectedMenu;
    }

    public boolean run() {
        boolean isRun = true;

        System.out.println("[ 도서 관리 프로그램 ]");
        System.out.println("1. 도서 등록");
        System.out.println("2. 도서 검색");
        System.out.println("3. 도서 수정");
        System.out.println("4. 도서 삭제");
        System.out.println("5. 도서 전체 조회");
        System.out.println("q. 프로그램 종료");

        String selectedMenu = selectMenu();

        switch (selectedMenu) {
            case "q":
                isRun = false;
                break;

            case "5":
                break;
            case "1":
                break;
            case "2":
                break;
            case "3":
                break;
            case "4":
                break;
            default:
                System.out.println("입력 오류");
        }
        System.out.println();
        return isRun;
    }

    private String validateValue(String title) {
        String value = null;
        while(true) {
            System.out.println(title + "명 입력 : ");
        }
    }

}
