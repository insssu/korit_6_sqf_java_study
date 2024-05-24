package com.study.java_study.ch06_배열;

import java.util.Scanner;

public class ArrayServiceTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] names = new String[0];

        boolean isRun = true;

        while(isRun) {
            System.out.println("[이름 관리 프로그램]");
            System.out.println("1. 등록");
            System.out.println("2. 수정");
            System.out.println("3. 삭제");
            System.out.println("4. 이름 찾기");
            System.out.println("5. 전체 조회");
            System.out.println("q. 프로그램 종료");

            String selectMenu = scanner.nextLine();

            switch (selectMenu) {
                case "1":
                    System.out.println("등록");
                    String[] newNames = new String[names.length + 1];
                    for(int i = 0; i < names.length; i++) {

                    }
                    break;
                case "2":
                    break;
                case "3":
                    break;
                case "4":
                    break;
                case "5":
                    break;
                case "q":
                    System.out.println("프로그램 종료");
                    isRun = false;

                    break;
            }
            System.out.println();
        }
    }
}
