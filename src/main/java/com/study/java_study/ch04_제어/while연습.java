package com.study.java_study.ch04_제어;

import java.util.Scanner;

public class while연습 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isRun = true;

        System.out.println("프로그램 시작");

        while(isRun) {
            System.out.println("[메인메뉴]");
            System.out.println("1. 회원 등록");
            System.out.println("2. 회원 조회");
            System.out.println("3. 회원 탈퇴");
            System.out.println("q. 프로그램을 종료합니다.");

            System.out.print("메뉴 선택 : ");
            String selectMenu = scanner.nextLine();
            switch (selectMenu) {
                case "1":
                    System.out.println("회원 등록으로 들어오셨습니다.");
                    break;
                case "2":
                    System.out.println("회원 조회로 들어오셨습니다.");
                    boolean isRunMenu2 = true;
                    while(isRunMenu2) {
                        System.out.println("[회원조회]");
                        System.out.println("1. 회원 번호로 조회");
                        System.out.println("2. 회원 이름으로 조회");
                        System.out.println("b. 뒤로가기");
                        System.out.println("q. 프로그램 종료하기");
                        System.out.print("메뉴 선택 : ");
                        selectMenu = scanner.nextLine();
                        switch (selectMenu) {
                            case "1":
                                System.out.println("회원 번호로 조회를 합니다.");
                                break;
                            case "2":
                                System.out.println("회원 이름으로 조회를 합니다.");
                                break;
                            case "b":
                                System.out.println("메인 메뉴로 이동합니다.");
                                isRunMenu2 = false;
                                break;
                            case "q":
                                System.out.println("프로그램을 종료합니다.");
                                isRunMenu2 = false;
                                isRun = false;
                                break;
                            default:
                                System.out.println("잘못 입력하셨습니다. 다시 입력하세요.");
                        }
                        System.out.println();
                    }
                    break;
                case "3":
                    System.out.println("회원 탈퇴로 들어오셨습니다.");
                    boolean outThisSite = true;
                    while(outThisSite) {
                        System.out.println("1. 탈퇴 하시겠습니까?");
                        System.out.println("b. 뒤로가기");
                        System.out.println("q. 종료하기");
                        System.out.print("메뉴 선택 : ");
                        selectMenu = scanner.nextLine();
                        switch (selectMenu) {
                            case "1":
                                System.out.println("탈퇴 하시겠습니까?");
                                boolean reCheck = true;
                                while(reCheck) {
                                    System.out.println("1. 예");
                                    System.out.println("2. 아니오");
                                    System.out.print("메뉴 선택 : ");
                                    selectMenu = scanner.nextLine();
                                    switch (selectMenu) {
                                        case "1":
                                            System.out.println("1. 예");
                                            break;
                                        case "2":
                                            System.out.println("2. 아니오");
                                            break;
                                    }
                                }
                                System.out.println("1. 예");
                                System.out.println("2. 아니오");
                                break;
                            case "b":
                                System.out.println("뒤로가기");
                                outThisSite = false;
                                break;
                            case "q":
                                System.out.println("프로그램을 종료합니다.");
                                outThisSite = false;
                                isRun = false;
                                break;

                        }
                        System.out.println();
                    }
                    break;
                case "q":
                    System.out.println("프로그램을 종료합니다.");
                    break;
                default:
                    System.out.println("잘못 입력하셨습니다. 다시 입력하세요.");
            }
            System.out.println();
        }
        System.out.println("프로그램 종료");
    }
}
