package com.study.java_study.ch20_람다;

public class ModificationMain {

    public static void main(String[] args) {
        Modification<String> m1 = new Modification<>() {
            @Override
            public String modify(String oldData, String newData) {
                System.out.println("기존 데이터 : " + oldData);
                System.out.println("새로운 데이터 : " + newData);
                return newData;
            }
        };

        Modification<String> m2 = new Modification<>() {
            @Override
            public String modify(String oldData, String newData) {
                return newData;
            }
        };
                                                // 어떤게 잘못돼서 바꾼건지  <T> -> String 으로
//        Modification<String> m3 = (oldName, newName) -> {     // 2. 매개변수의 타입을 생략 할 수 있다.
//            System.out.println("기존 데이터 : " + oldName);
//            System.out.println("새로운 데이터 : " + newName);
//            return newName;
//        };
        Modification<String> m3 = (oldName, newName) -> newName;   // 위에 주석달아 놓은 것과 같은 코드. 다른것들은 다 빠지고 오버라이드만 들어간 것.

        String name = "김준일";
        String newName = m1.modify(name, "김준이");
        System.out.println(newName);

        String newName2 = m2.modify(name, "김준삼");
        System.out.println(newName2);

        String newName3 = m3.modify(name, "김준삼");
        System.out.println(newName3);
    }
}
