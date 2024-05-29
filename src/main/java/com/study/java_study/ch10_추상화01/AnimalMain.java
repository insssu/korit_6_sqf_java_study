package com.study.java_study.ch10_추상화01;
// 추상 : 여러가지 사물이나 개념에서 공통되는 특성이 있는 속성 따위를 추출하여 파악하는 작용
public class AnimalMain {

    public static void main(String[] args) {
        Dog dog = new Dog("뭉이", 10, "말티즈");            // 동물 객체 생성         부모(상위) 객체를 먼저 추출하고
                                          // 강아지 객체 생성        자식(하위) 객체를 추출
        Animal tiger = new Tiger("응이", 5, 100);      // 공통되는 사항을 묶어줄 수는 없을까? => 상속 extends 순서를 잘 봐야한다.

        System.out.println();
        dog.move();
        tiger.move();
        ((Tiger)tiger).hunt();          // (Tiger)tiger.hunt(); 는 참조 연산을 먼저 하기때문에 Tiger class에 있는 연산자를 사용하고싶어도 업캐스팅 되어있기 때문에 사용할 수 없다.
        dog.bark();

        System.out.println();

        Animal[] animals = new Animal[3];
        animals[0] = new Animal("이름없는 동물", 10);
        animals[1] = new Dog("뭉이", 10, "말티즈");
        animals[2] = new Tiger("응이", 5, 100);

        for(Animal animal : animals) {
            animal.move();
        }

        System.out.println();
 /*
        for (Animal animal : animals) {             // animals에서 하나 빼오고 하나씩 대입할 때

            if(animal instanceof Tiger) {           // animal이라는 객체가 tiger 원래 자료형이 animal이었니? Tiger이 animal로 업캐스팅 된적이 있는지 물어보는 것
                Tiger t = (Tiger) animal;           // 다운 캐스팅하는 과정
                t.hunt();
            }else if(animal instanceof Dog) {       //
                Dog d = (Dog) animal;
                d.bark();
            }
        }

 */

        // instanceof 를 최신버전에서는 x.getClass() == y.class 를 사용한다. 호환성때문에

        for (Animal animal : animals) {             // animals에서 하나 빼오고 하나씩 대입할 때

            if(animal.getClass() == Tiger.class) {           // animal이라는 객체가 tiger 원래 자료형이 animal이었니? Tiger이 animal로 업캐스팅 된적이 있는지 물어보는 것
                System.out.println(animal.getClass());
                Tiger t = (Tiger) animal;           // 다운 캐스팅하는 과정
                t.hunt();
            }else if(animal.getClass() == Dog.class) {       //
                System.out.println(animal.getClass());
                Dog d = (Dog) animal;
                d.bark();
            }
        }
    }
}
