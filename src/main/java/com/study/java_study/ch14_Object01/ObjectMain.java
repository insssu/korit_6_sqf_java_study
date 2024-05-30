package com.study.java_study.ch14_Object01;

    /*
        Object 클래스 (최상위 클래스)
    */

import java.util.Objects;

public class ObjectMain {

    public static void main(String[] args) {
        Object object = new Object();
        Student student = new Student("황인수", 29);
        Student student2 = new Student("황인수", 29);

        Object[] objects = new Object[3];           // 이 부분이 가장 중요한 부분. Object는 최상위 개념이라는 것.
        objects[0] = new Object();                  // 자료형 상관없이 다 담을 수 있다.
        objects[1] = "test";
        objects[2] = new Student("황인수", 29);

        System.out.println(student.toString());     // toString은 생략가능
        System.out.println(student);
        String str = new String("데이터");
        System.out.println(str.toString());
        System.out.println(str);

        //String studentDate = student 으로만 쓰게되면 student는 주솟값이므로 에러가 뜬다. str값으로 사용하는 것을 표현해 주기 위해서 toString을 사용한다.
        String studentDate = student.toString();        // toString의 리턴 데이터가 String이기 때문에.

        System.out.println(student.equals(student2));   // equals는 값을 비교.
        System.out.println(student.hashCode());     // 주솟값 : 940060004
        System.out.println(student2.hashCode());    // 주솟값 : 234698513

        System.out.println(student.hashCode() == student2.hashCode());
        System.out.println();
        System.out.println(Objects.hash("황인수"));
        System.out.println(Objects.hash("황인수"));


    }
}
