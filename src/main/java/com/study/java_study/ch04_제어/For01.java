package com.study.java_study.ch04_제어;

public class For01 {

    public static void main(String[] args) {
        for(int i = 0; i < 10000; i++) {            // 1) i 는 0부터 반복해라; 2) i가 10000(반복횟수)이 되기 전까지.; 4) 한 번 할때마다 i를 증가시켜라. 이 틀을 벗어나지 말자. 대부분이 이 틀에서 작용한다
            System.out.println(i + 1);              // 3) 1을 증가시켜라. 1만번 반복하는 코드이다.
        }                                            // 1) > 2) > 3) > 4) 순으로 처리되고 시작문은 처음에만 실행 후 2)번부터 시작

        for(int i = 0; i < 10000; i++) {
            System.out.println(10000 - i);
        }

    }
}
