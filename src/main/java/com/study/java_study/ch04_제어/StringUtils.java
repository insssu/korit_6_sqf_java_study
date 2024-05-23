package com.study.java_study.ch04_제어;

public class StringUtils {

    boolean isEmpty(String str) {  // 함수가 '~이다', '~아니다'를 판별할때 앞에 is나 has를 붙인다.
        if(str == null) {
            return true;
        }
        return str.equals("");     // 쓸데없이 else 조건을 사용할 필요가 없다. 최대한 else를 안쓸 수 있으면 안쓰게 만드는것이 좋다.
    }
    // return str == null || str.equals("");       // 조건을 쓸 때 순서도 중요하다.

}
