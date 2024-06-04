package com.study.java_study.ch19_익명클래스;

public class CarMain {

    public static void main(String[] args) {
        KiaCar kiaCar = new KiaCar("k8", "화이트");
        System.out.println(kiaCar);


        AbstractCar abstractCar = new AbstractCar("내가 만든 자동차", "블랙") {  // AbstractCar abstractCar = new AbstractCar() 까지는 임의로 클래스를 구현하는 것이고,
                                  // {} 클래스 정의 에는 class 파일을 굳이 따로 안만들고 정의하는 것.
                                  // 예를 들어 홈페이지에서 로그인은 한번 구현만 하면 더이상 필요 없는 것. (부모가 가진 것을 상속받아 내용만 바꿔서 쓰겠다.?)
                                  //
            @Override
            public void createCar() {
                System.out.println("한번 만들어봄");
            }

            @Override
            public void showCar() {
                System.out.println("자동차 정보...");

            }
        };

    }
}
