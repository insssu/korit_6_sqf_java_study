package com.study.java_study.ch14_Object01;

import java.util.Objects;

public class Student /*extends Object*/ {

    private String name;      // 변수 정의 - 생성자 - getter setter - equals - hashcode - toString
    private int age;          // 순서의 차이는 크게 상관이 없지만 통상적으로 위 순서로 쓴다.

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // getter setter 자리


    @Override
    public boolean equals(Object obj) {
        if(this == obj) {
            return true;
        }
        if(obj.getClass() == this.getClass()) {         // 주소가 다를경우
            Student student = (Student) obj;
            return Objects.equals(student.name, name) && Objects.equals(student.age, age);
        }
        return false;

    }

    @Override
    public int hashCode() {             // hashCode : 주솟값
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }



}
