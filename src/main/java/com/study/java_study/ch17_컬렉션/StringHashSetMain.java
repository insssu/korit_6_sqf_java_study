package com.study.java_study.ch17_컬렉션;

import java.util.*;

public class StringHashSetMain {

    public static void main(String[] args) {

        HashSet<String> strSet = new HashSet<>();       // set 은 주로 집합을 나타낼 때 쓴다. 데이터의 중복이 없기 때문에

        // 추가
        strSet.add("김준일");        // collection을 상속받은 애들은 add가 추가되어 있기 때문에 모두 add
        strSet.add("김준이");
        strSet.add("김준삼");
        strSet.add("김준사");

        System.out.println(strSet);

        for(String name : strSet) {                       // 순서가 없기 때문에 i를 사용할 수 없음 따라서 무조건 for each문을 사용
            System.out.println(Objects.hash(name));
        }

        strSet.addAll(List.of("김준일", "김준일", "김준이"));

        ArrayList<String> strList = new ArrayList<>();
        strList.addAll(strSet);                           // list 에 중복된 아이들을 set 에 넣고 다시 빼면 중복이 제거된 list목록을 만들 수 있다. 핵심 !

        Comparator<String> stringComparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return String.CASE_INSENSITIVE_ORDER.compare(o1, o2);
            }
        };

        strList.sort(stringComparator);
        System.out.println("strList.sort(stringComparator);와 System.out.println(strList);가 같은 코드입력. 람다식 배운뒤에 배울 내용");
        strList.sort((o1, o2) -> String.CASE_INSENSITIVE_ORDER.compare(o1, o2));
        System.out.println(strList);


    }
}
