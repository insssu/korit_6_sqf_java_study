package com.study.java_study.ch15_Static;

    /*
        싱글톤 디자인 패턴
        1. 객체를 유일하게 하나만 생성하여 사용하는 기법
        2. 생성자가 private으로 외부에서는 생성 할 수 없다.

    */

public class StudentMain {

    public static void main(String[] args) {
        StudentService studentService = StudentService.getInstance();           // StudentService에 있는 getInstance에 public static이 있기 때문에 호출 할 수 있다.
        StudentService studentService2 = StudentService.getInstance();

//        StudentRepository studentRepository = new StudentRepository();
//        studentRepository.add("박인수");

        studentService.addStudent();                          // StudentRepository studentRepository = new StudentRepository();
        StudentRepository.getInstance().add("박인수");         // StudentRepository.getInstance() 이것 자체가 객체의 주소가 되어서 .add() 를 바로 받아서 입력할 수 있음
        studentService2.addStudent();

        studentService.getStudentData();


    }
}
