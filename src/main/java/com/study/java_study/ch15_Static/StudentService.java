package com.study.java_study.ch15_Static;

public class StudentService {
    private static StudentService instance;         // 자기 자신을 담을 수 있는 instance변수가 있어야 하고,

    private StudentService() {}                     // 외부에서 생성될 수 없게 자신의 주소에 private을 걸어둬야 하고,

    public static StudentService getInstance() {    // 리턴 자료형이 자기 자신이어야 한다 ! 본인을 담을 수 있는 통에 본인을 담아서
        if(instance == null) {                      // 꺼내 써야지만 다른곳에서 호출해서 쓸 때 주소값의 변경이 없으니까.
            instance = new StudentService();        // >> 최초 한번 객체 주소를 생성해주는 행위.
        }
        return instance;
    }

    public void addStudent() {
        StudentRepository.getInstance().add("황인수");
    }

    public void getStudentData() {
        String[] names = StudentRepository.getInstance().getNames();
        for(String name : names) {
            System.out.println(name);
        }
        System.out.println();
    }
}
