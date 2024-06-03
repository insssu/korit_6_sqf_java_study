package com.study.java_study.ch15_Static;

public class StudentRepository {

    private String[] names;

    private static StudentRepository instance;          // 자기 자신을 담을 수 있는 instance변수가 있어야 하고,

    private StudentRepository() {                       // 외부에서 생성될 수 없게 자신의 주소에 private을 걸어둬야 하고,
        names = new String[5];
    }

    public static StudentRepository getInstance() {     // 리턴 자료형이 자기 자신이어야 한다 ! 본인을 담을 수 있는 통에 본인을 담아서
        if(instance == null) {                          // 꺼내 써야지만 다른곳에서 호출해서 쓸 때 주소값의 변경이 없으니까.
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
