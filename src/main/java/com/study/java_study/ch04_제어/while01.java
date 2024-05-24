package com.study.java_study.ch04_제어;

import java.util.Random;
import java.util.Scanner;           // Library 안의 java.base 안의 java안의 lang 이외에 들어있는것은 다 import를 해야한다.

public class while01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Random random = new Random();
        int num = random.nextInt(10);       // 0 ~ 9까지 중 랜덤한 값을 가지는 범위를 뜻함. nextInt(10) +1 은 1부터 10까지

        while(true) {
            System.out.print("입력 : ");
            int data = scanner.nextInt();
            if(num == data) {
                System.out.println("정답은 " + data + "입니다.");
                break;
            }
            System.out.println("틀렸습니다. 다시 입력하세요.");
        }

    }
}
