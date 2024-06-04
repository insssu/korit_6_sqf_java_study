package com.study.java_study.ch18_빌더;

import lombok.Builder;

@Builder
public class StudentEntity {
    private int studentCode;
    private String name;
    private int age;
}
