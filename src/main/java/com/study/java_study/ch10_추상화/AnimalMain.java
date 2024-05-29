package com.study.java_study.ch10_추상화;
// 추상 : 여러가지 사물이나 개념에서 공통되는 특성이 있는 속성 따위를 추출하여 파악하는 작용
public class AnimalMain {

    public static void main(String[] args) {
        //Dog dog = new Dog();            // 동물 객체 생성         부모(상위) 객체를 먼저 추출하고
                                          // 강아지 객체 생성        자식(하위) 객체를 추출
        Animal tiger = new Tiger();      // 공통되는 사항을 묶어줄 수는 없을까? => 상속 extends 순서를 잘 봐야한다.

        System.out.println();
        //dog.move();
        tiger.move();
    }
}
