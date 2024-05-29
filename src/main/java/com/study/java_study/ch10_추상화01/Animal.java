package com.study.java_study.ch10_추상화01;

public class Animal {
    private String name;
    private int age;

    public Animal() {

        System.out.println("동물 객체 생성");
    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void move() {
        System.out.println("동물이 움직입니다.");

    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    // 메모리 자료형의 확장이 된다. 기존의 자료형에 새로운 자료 살을 붙인다.
}
