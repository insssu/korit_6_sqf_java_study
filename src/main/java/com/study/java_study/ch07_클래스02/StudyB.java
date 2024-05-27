package com.study.java_study.ch07_클래스02;

public class StudyB {

    private String name;            // private : 비공개한다
    private int age;                // 본인 클래스 안에서는 접근할 수 있다. 그러나 외부에서는 절대 접근할 수 없다.

    public StudyB() {}             // 기본이 private StudyB()인데 생성자 public StudyB()를 하게되면
                                    // 생성자로 덮어쓰여지기 때문에 private StudyB() 를 사용하고 싶다면 따로 선언해줘야 한다.

    public StudyB(String name, int age) {  // private 이더라도 생성할 때 public에서 값을 받기 때문에 생성자를 만들 수 있다.
        this.name = name;                   // 캡슐화 : 정해진 절차대로 진행될 수 있도록 하는 것.
        this.age = age;
    }

    public String getName() {               // Alt + insert를 누르면 기능이 있다. 게터 세터
        return name;                        // 게터 세터를 통해 표준화를 하자고 통용된다.
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void show() {
        System.out.println(name);
        System.out.println(age);

    }
}
