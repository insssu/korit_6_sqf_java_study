package com.study.java_study.ch04_제어;

import com.sun.jdi.PathSearchingVirtualMachine;

public class For02 {

    public static void main(String[] args) {

        for(int i = 0; i < 3; i++) {
            System.out.println(i + 1 + "일차");
            for(int j = 0; j < 10 * (i + 1); j++) {                    // 여러개의 for문을 작성해야 하는 줄 알았는데
                System.out.println("줄넘기: " + (j + 1) + "개");        // 하나의 for문 안에서 변수를 작성하여 나타낼 수 있구나 j < 10 * (i + 1)
            }
        }
    }
}
