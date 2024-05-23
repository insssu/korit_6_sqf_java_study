package com.study.java_study.ch04_제어;

public class 스위치 {

    public static void main(String[] args) {
        String grade = "B";                     // 바로가기 느낌. 언급한 지점부터 실행되는

        switch (grade) {
            case "A":
                System.out.println("A등급");
                break;
            case "B":
                System.out.println("B등급");
                break;
            case "C":
                System.out.println("C등급");
                break;
            case "D":
                System.out.println("D등급");
                break;
            default:
                System.out.println("F등급");

        }
    }
}
