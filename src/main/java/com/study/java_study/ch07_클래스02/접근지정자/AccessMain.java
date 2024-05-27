package com.study.java_study.ch07_클래스02.접근지정자;

import com.study.java_study.ch07_클래스02.StudyB;      // 패키지가 다르면 무조건 import를 해준다.

/*
    1. private -> 같은 객체(class) 안에서만 접근 할 수 있다.
    2. public -> 모든 영역에서 접근 할 수 있다. 다른 패키지에 있더라도.                   모두
    3. default -> 같은 패키지 안에서만 접근 할 수 있다. 앞에 아무것도 안붙인 것이 default. 가족
    4. protected -> default와 동일하게 같은 패키지 안에서 접근 할 수 있고,               친인척
                    상속관계일 때에는 다른 패키지에 있어도 접근 할 수 있다.

 */

public class AccessMain {
    private String test;

    public void printTest() {
        System.out.println(test);
    }

    public static void main(String[] args) {
        StudyB b = new StudyB("황인수", 29);
        b.show();
        b.setName("김준이");
        System.out.println(b.getName());


        AccessMain accessMain = new AccessMain();       // 얘는 왜 선언해주지
        accessMain.printTest();
        accessMain.test = "테스트";


    }
}
