package com.study.java_study.ch11_추상화02;

public class AnimalMain {

    public static void main(String[] args) {
        Animal[] animals = new Animal[10];

        for(int i = 0; i < animals.length; i++) {
            animals[i] = i % 2 == 0 ? new Dog() : new Tiger();  // 삼항연산자. 앞에 연산이 참이라면 바로 뒤에오는 연산을, 거짓이라면 그 뒤에 오는 연산을 실행.
        }

        for(Animal animal : animals) {
            animal.move();
        }
    }
}
