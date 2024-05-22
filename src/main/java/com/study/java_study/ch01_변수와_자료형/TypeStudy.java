package com.study.java_study.ch01_변수와_자료형;

public class TypeStudy {
    public static void main(String[] args) {
        // [ 일반 자료형 ]
        // 1. 논리
        boolean a = false;
        boolean b = true;

        // 2. 숫자 (정수)
        int c = 10000000;
        long d = 100000000000000l;

        // 3. 숫자 (실수)
        double e = 3.14;

        // 4. 문자
        char f = '가';   // AC00
                        // 한 글자만 표기하는것은 작은따옴표 (''), 두 자부터는 쌍따옴표("")를 쓰며 문자가 아닌 문자열을 쓴다
        char j = '합';

        // 5. 문자열
        String g = "가나";

        System.out.println(f);
        System.out.println((char)((int)f + 1));     // 형변환
        System.out.println((int)j);

        // 형변환 문자 -> 정수 -> 실수

        double num = 3.14;
        System.out.println(num);
        int num2 = (int)num;            // 명시적 형변환 : 데이터의 손실이 있을경우 사용자가 의도적으로 바꾸는 경우 / 다운캐스팅
        System.out.println(num2);
        double num3 = num2;             // 업캐스팅
        System.out.println(num3);





    }
}
