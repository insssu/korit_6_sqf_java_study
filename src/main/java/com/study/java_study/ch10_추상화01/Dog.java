package com.study.java_study.ch10_추상화01;

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
    public void move() { // ctrl + 'o' 를 입력하면 나오는 기능
        System.out.println("강아지가 네발로 움직입니다.");
    }

    public void bark() {
        System.out.println(breed + "종의 강아지가 짖습니다.");
    }


    @Override           //윗줄에 public void만 입력했을 경우 빨간밑줄이 생기는 이유는 뭐지?
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
