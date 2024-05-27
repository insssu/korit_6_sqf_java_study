package com.study.java_study.ch08_클래스03;

import com.study.java_study.ch04_제어.StringUtils;

import java.sql.SQLOutput;

public class StudentMain {

    public static void main(String[] args) {

        int[] nums = new int[3];
        //공간 세개 int자료형의 nums라는 변수 선언
        nums[0] = 10;
        nums[1] = 20;
        nums[2] = 30;

        Student student1 = new Student();   // () 객체 생성. [] 배열 생성.
        Student student2 = new Student();
        Student student3 = new Student();

        Student[] studentss = new Student[] {
                new Student(20240501, "황인수", 31), // 0번 인덱스
                new Student(20240502, "김인수", 29), // 1번 인덱스
                new Student(20240503, "박인수", 25)  // 2번 인덱스
        };

        Student[] students = new Student[3];    // 오류 이유 : NullPointerException

        students[0] = new Student(20240501, "황인수", 31);
        students[1] = new Student(20240502, "김인수", 29);
        students[2] = new Student(20240503, "박인수", 25);
        students[3] = new Student(20240504, "최인수", 56);
        // 공간 다섯개 Student?자료형 students라는 변수를 선언

        String name = students[0].getName();
        System.out.println(students[0].getName());

        for(int i = 0; i < students.length; i++) {
            if(students[i] == null) {           // if문을 걸어주면 NullPointerException을 해결해줄 수 있다.
                continue;
            }
            System.out.println("학번 : " + students[i].getCode());
            System.out.println("이름 : " + students[i].getName());
            System.out.println("나이 : " + students[i].getAge());
            System.out.println();
        }
    }
}
