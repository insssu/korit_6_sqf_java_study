package com.study.java_study.ch18_빌더;

public class StudentMain {

    public static void main(String[] args) {
        StudentEntity studentEntity = StudentEntity.builder()
                .studentCode(123)
                .age(29)
                .name("황인수")
                .build();
    }
}
