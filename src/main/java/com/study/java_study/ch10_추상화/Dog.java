package com.study.java_study.ch10_추상화;

public class Dog extends Animal{       // animal은 dog를 추상화 했다.
    /*
    private String name;
    private int age;

     */
    private String breed;

    public Dog() {
        super();        // 생략되어 있는 부모객체 생성자 Animal 객체 생성자 호출
                        // 같은 의미로 this는 본인 class 안에 자신을 가리키는 것이고, super은 부모객체를 호출하는 생성자.
        System.out.println("강아지 객체 생성");
    }

    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "breed='" + breed + '\'' +
                '}';
    }

}
/*
    public Dog(String name, int age, String breed) {
        this.name = name;
        this.age = age;
        this.breed = breed;
    }

    @Override
    public String toString() {
        return "Dog {" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", breed='" + breed + '\'' +
                '}';
    }

     */
