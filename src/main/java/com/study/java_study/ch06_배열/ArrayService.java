package com.study.java_study.ch06_배열;

import java.util.Scanner;

public class ArrayService {

    public static void main(String[] args) {                // 배열은 크기를 바꿀 수 없기 때문에 새로운 배열을 만들기 위해서는
        Scanner scanner = new Scanner(System.in);           // 새로운 틀을 만든 후 배열을 다시 해줘야 한다.
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
            System.out.print("메뉴 선택 : ");

            String selectManu = scanner.nextLine();

            switch (selectManu) {
                case "1":
                    System.out.println("1. 등록");
                    String[] newNames = new String[names.length + 1];
                    for(int i = 0; i < names.length; i++) {
                        newNames[i] = names[i];
                    }
                    names = newNames;
                    System.out.print("등록 할 이름 : ");
                    names[names.length - 1] = scanner.nextLine();
                    System.out.println("등록 완료");
                    break;

                case "2":
                    System.out.println("2. 수정");
                    System.out.print("수정 할 이름 : ");
                    String changeName = scanner.nextLine();
                    for(String name : names) {
                        if(name.equals(changeName)) {
                            System.out.print("변경 : ");



                            break;
                        }
                    }

                    break;
                case "3":
                    System.out.println("3. 삭제");
                    String removeName = scanner.nextLine();
                    for(int i = 0; i < removeName.length(); i++) {

                    }



                    break;
                case "4":
                    System.out.println("[이름 찾기]");
                    System.out.print("조회 할 이름 : ");
                    String result = null;
                    String findName = scanner.nextLine();
                    for(String name : names) {
                        if(name.equals(findName)) {
                            result = name;
                            //System.out.println("해당 이름은 등록된 이름입니다.");        // 탐색은 들고나온값이 있으면~ 없으면~ 으로 구분하여 반복문을 탈출한다.
                            break;  // for문을 빠져나가는 break
                        }
                    }
                    if(result == null) {
                        System.out.println("해당 이름은 등록되지 않은 이름입니다.");

                        break;
                    }// if문을 빠져나가는 break
                        System.out.println("해당 이름은 등록된 이름입니다.");
                    break;
                case "5":
                    System.out.println("[전체 조회]");
                    for(int i = 0; i < names.length; i++) {
                        System.out.println("index[" + i + "]" + names[i]);
                    }

                    break;
                case "q":
                    isRun = false;
                    break;
                default:
                    System.out.println("다시 입력하세요");
            }
            System.out.println();
        }

    }
}
