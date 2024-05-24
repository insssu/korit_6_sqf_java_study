package com.study.java_study.ch04_제어;

import java.util.Scanner;

public class while02 {
    public static void main(String[] args) {            // while은 조건을 참고하는것이 중요

        Scanner scanner = new Scanner(System.in);

        System.out.print("개수 : ");
        int count = scanner.nextInt();

        int i = 0;
        while(i < count) {
            if(i % 2 == 0) {
                System.out.println("짝수 입니다." + i);
                i++;
                continue;               // continue는 다음 반복으로 넘어가라.
            }
            System.out.println("홀수 입니다." + i);
            i++;
        }

        System.out.print("개수 : ");

        for(int j = 0; j < count; j++) {
            if(j % 2 == 0) {
                System.out.println("짝수 입니다." + j);
                continue;
            }
            System.out.println("홀수 입니다." + j);

        }
    }
}
