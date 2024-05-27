package com.study.java_study.ch06_배열;

import java.util.Scanner;

public class BookArrayService {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] names = new String[0];
        BookArrayUtils bookArrayUtils = new BookArrayUtils();
        boolean Library = true;

        while(Library) {
            System.out.println("도서관");
            System.out.println("1. 책 등록");
            System.out.println("2. 책 수정");
            System.out.println("3. 책 삭제");
            System.out.println("4. 책 검색");
            System.out.println("5. 전체 조회");
            System.out.println("q. 실행종료");
            System.out.print("메뉴 선택 : ");

            String selecMenu = scanner.nextLine();

            String[] newNames = null;
            int findIndex = -1;

            switch (selecMenu) {
                case "1":
                    System.out.println("[책 등록]");
                    newNames = new String[names.length + 1];
                    for(int i = 0; i < names.length; i++) {
                        newNames[i] = names[i];
                    }
                    names = newNames;
                    System.out.print("등록 할 책 : ");
                    names[names.length - 1] = scanner.nextLine();
                    System.out.println("등록완료");
                    break;

                case "2":
                    System.out.println("[책 수정]");

                case "3":
                    System.out.println("[책 삭제]");

                case "4":
                    System.out.println("[책 검색]");
                    System.out.print("조회 할 책 제목 : ");

                    String findName = scanner.nextLine();
                    findIndex = bookArrayUtils.findIndexbyBookName(names, findName);
                    if(findIndex == -1) {
                        System.out.println("해당 책은 등록되어있지 않습니다.");
                        break;

                    }
                        System.out.println("해당 책은 등록되어 있습니다.");
                    break;

                case "5":
                    System.out.println("[전체 조회]");
                    for(int i = 0; i < names.length; i++) {
                        System.out.println("index[" + i + "]" + names[i]);
                    }
                    break;

                case "q":
                    System.out.println("[프로그램 종료]");
                    Library = false;
                    break;

                default:
                    System.out.println("잘못 입력하였습니다.");
            }
            System.out.println();

        }


    }


}

