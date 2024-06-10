package com.study.java_study.ch22_예외;

import java.util.ArrayList;
import java.util.List;

public class NullExceptionMain {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("신선애");
        names.add("김동인");
        names.add("백승주");
        names.add("김준일");

        try {
//            names.forEach(name -> System.out.println(name.toString()));
            for (int i = 0; i < 5; i++) {
                System.out.println(names.get(i).toString());
            }
            System.out.println("트라이 마지막 부분"); // 예외가 발생하면 명령의 묶음 내에서는 예외 발생 시점에서 동작이 멈춘다

        } catch (NullPointerException e) {
            e.printStackTrace();
        } catch (IndexOutOfBoundsException e) {
            e.printStackTrace();
        } catch (Exception e) {     // 어떤 예외든지 업캐스팅 되어 예외처리가 가능해진다. Throwable은 최상위에 있는 예외
            e.printStackTrace();
        } catch (Throwable e) {
            e.printStackTrace();
        } finally {
            System.out.println("예외이든 아니든 실행");
        }

        System.out.println("프로그램 종료");
    }
}
