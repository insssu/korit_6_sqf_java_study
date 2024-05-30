package com.study.java_study.ch15_Static;

public class StudentRepository {

    private String[] names;

    private static StudentRepository instance;

    private StudentRepository() {
        names = new String[5];
    }

    public static StudentRepository getInstance() {
        if(instance == null) {
            instance = new StudentRepository();         // 새로운 주소를 생성한 과정
        }
        return instance;        // 메소드의 결과 자체가 객체의 주소가 되는 것.
    }
    public void add(String name) {
        for(int i = 0; i < names.length; i++) {
            if(names[i] == null) {
                names[i] = name;
                break;
            }
        }
    }

    public String[] getNames() {
        return names;
    }
}
