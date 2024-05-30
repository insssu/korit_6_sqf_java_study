package com.study.java_study.ch12_추상화03;

public abstract class AbstracAuthority implements Authority {       // abstract로 인해 이 클래스는 새로 생성할 것은 아니라는 것을 알 수 있다.
                                                                    // 단순 설계도를 만든 것
                                                                    // implements 는 class 와 interface 처럼 다른 '' 간에 상속? 해주기 위해 사용하는 키워드
                                                                    // extends 는 같은 종류에서 상속 할 경우 사용하는 키워드
                                                                    // 공통사항을 묶어서 추상화시킬 수 있다. 만들어 쓰기 나름. 주로 라이브러리를 만들 때.
    private String role;

    public AbstracAuthority() {
        role = DEFAULT_ROLE;
    }


    public AbstracAuthority(String role) {
        this.role = role;
    }

    @Override
    public String getAuthority() {
        return role;
    }
}




        /*

            ex



         */