package com.study.java_study.ch17_컬렉션;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class StringHashMapMain {

    public static void main(String[] args) {
        HashMap<Integer, String> strMap = new HashMap<>();

        strMap.put(10, "황인수");           // put에는 두가지가 한 쌍으로 들어와야 한다. key 와 value
        strMap.put(11, "박인수");
        strMap.put(12, "최인수");
        strMap.put(13, "김인수");           // 이렇게 쓸 바에는 List를 쓰는게 낫다

        System.out.println(strMap);       // {0=황인수, 1=박인수, 2=최인수, 3=김인수}
        System.out.println(strMap.get(0));      // null
        System.out.println(strMap.get(11));     // 박인수
        System.out.println();

        Map<String, String> lang = Map.of(
                "java", "자바",
                "c", "C",
                "python", "파이썬",
                "js", "자바스크립트"
        );

        System.out.println(lang);

        System.out.println(lang.get("java"));

//        for(String key, String value :lang;) {
        Set<Map.Entry<String, String>> entries = lang.entrySet();     // 중복으로 넣게 되면 key value가 같은게 나오기 때문에 이 entry 는 Set에 담긴다.

        for (Map.Entry<String, String> entry : entries) {             // Set에서 엔트리 하나 꺼내서 1:1 매치
            System.out.println("key : " + entry.getKey());
            System.out.println("value : " + entry.getClass());

        }

    }
}
