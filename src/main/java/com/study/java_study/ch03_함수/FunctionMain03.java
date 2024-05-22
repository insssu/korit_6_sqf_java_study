package com.study.java_study.ch03_함수;

public class FunctionMain03 {
    public static void main(String[] args) {

        Function03 fx = new Function03();

        fx.fx01(1234, "황인수", 29, "01095846142"); // 코딩에서는 숫자 0이 제일 앞에오면 안되므로 문자열로 처리를 한다

        Student student = new Student();

        student.name = "황인수";
        student.age = 245;
        student.studentCode = 3555845;
        student.phone = "141414141414";


        fx.fx02(student);


    }
}
