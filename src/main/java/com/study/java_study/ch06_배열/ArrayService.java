package com.study.java_study.ch06_배열;

import java.util.Scanner;

public class ArrayService {

    public static void main(String[] args) {                // 배열은 크기를 바꿀 수 없기 때문에 새로운 배열을 만들기 위해서는
        ArrayUtils arrayUtils = new ArrayUtils();

        Scanner scanner = new Scanner(System.in);           // 새로운 틀을 만든 후 배열을 다시 해줘야 한다.
        String[] names = new String[0];

        boolean isRun = true;

        while(isRun) {
            System.out.println("[이름 관리 프로그램]");         //CRUD : creat/ read / update / delete
            System.out.println("1. 등록");                    // CRDU 순서로 작성하면 편하다.
            System.out.println("2. 수정");
            System.out.println("3. 삭제");
            System.out.println("4. 이름 찾기");
            System.out.println("5. 전체 조회");
            System.out.println("q. 프로그램 종료");
            System.out.print("메뉴 선택 : ");

            String selectManu = scanner.nextLine();

            String[] newNames = null; //
            int findIndex = -1;                 // 배열의 인덱스는 0부터 시작함. -1의 값이 들어가 있으면


            switch (selectManu) {       // 스위치문은 스위치문이 끝나는 중괄호까지가 한 묶음이라서
                                        // 같은 선언문을 사용할 수 없다. 공통의 변수명이 사용된다면 스위치문 위쪽에 따로 빼줘서
                                        // 통일시켜 준다.
                case "1":
                    System.out.println("1. 등록");
                    newNames = new String[names.length + 1];
                    for(int i = 0; i < names.length; i++) {
                        newNames[i] = names[i];
                    }
                    names = newNames;
                    System.out.print("등록 할 이름 : ");
                    names[names.length - 1] = scanner.nextLine();
                    System.out.println("등록 완료");
                    break;

                case "2":
                    System.out.println("[이름 수정]");
                    System.out.print("수정 할 이름 : ");
                    String modifyName = scanner.nextLine();

                    findIndex = arrayUtils.findIndexByName(names, modifyName);
                    if(findIndex == -1) {
                        System.out.println("해당 이름은 존재하지 않습니다.");
                        break;
                    }
                    System.out.println("새 이름 : ");
                    names[findIndex] = scanner.nextLine();
                    System.out.println("수정 완료!");
                    //for(int i = 0; i < names.length; i++) {


                        //만약에 등록되어있는 이름을 찾으면 그 인덱스를 이용해서
                        //등록되어있는 이름 위치 = 변경하고자하는 이름 으로 바꿀거야

                    break;
                case "3":
                    System.out.println("[이름 삭제]");
                    System.out.print("삭제 할 이름 : ");
                    String removeName = scanner.nextLine();
                                                        // 반복이 돌았을 때 i를 대입하는 시점이 removeName과 name의 값이 일치할 때
                                                        // 값을 넣어주는데 동일한 값이 없다면 -1을 유지하고 있겠지
                    for(int i = 0; i < names.length; i++) {
                        String name = names[i];
                        if(name.equals(removeName)) {
                            findIndex = i;
                            break;
                        }
                    }
                    if(findIndex == -1) {
                        System.out.println("해당 이름은 존재하지 않습니다.");
                        break;
                    }
                    newNames = new String[names.length -1];          // 크기가 하나 줄어든 배열을 하나 만든 과정
                    for(int i = 0; i < newNames.length; i++) {       // 삭제는 배열의 크기를 줄여야 한다. 그러려면 크기가 하나 줄어든 배열을 하나 만들고 옮겨줘야 하겠지>?
                        if(i < findIndex) {
                            newNames[i] = names[i];
                            continue;
                        }
                        newNames[i] = names[i + 1];
                    }
                    names = newNames;
                    System.out.println(removeName + "을(를) 삭제하였습니다.");

                    break;
                case "4":
                    System.out.println("[이름 찾기]");
                    System.out.print("조회 할 이름 : ");

                     String findName = scanner.nextLine();
                    findIndex = arrayUtils.findIndexByName(names, findName);
                    if(findIndex == -1) {
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
