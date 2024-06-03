package com.study.java_study.ch16_제네릭;

public class SenderMain {

    public static void main(String[] args) {

//                  [ Wrapper 자료형 ]
//      <class 타입>                  <일반 자료형>

//        Integer                       int
//        Boolean     --(언박싱)-->      boolean
//        Character                     char
//        Double      <--(박 싱)--      double            new String 도 일종의 박싱
//        long                          long
//        Float                         float



        Integer num = new Integer(10);  // 박싱
        int num2 = num.intValue();      // 언박싱

        Integer num3 = 20;  // 자동 박싱    20 자체는 일반 자료형. 일반자료형은 넣지 못하니 박싱이 필요.
        int num4 = num3;    // 자동 언박싱 / java는 자동으로 박싱, 언박싱이 된다.

//        Sender sender1 = new Sender<Integer, String, Double>(10, "20", 3.14);           // new 로 새로 객체를 만들고 할당할 형태는 <> 레퍼로 정해준다.
        Sender<Integer, String, Double> sender1 = new Sender<>(10, "20", 3.14);           // 앞으로 땡겨주면 생략 가능. 데이터 자료형은 맞춰 주어야 한다.
        System.out.println(sender1);


    }
}
