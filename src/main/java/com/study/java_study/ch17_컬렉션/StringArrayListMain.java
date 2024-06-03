package com.study.java_study.ch17_컬렉션;

import java.rmi.Remote;
import java.util.*;

public class StringArrayListMain {

    public static void main(String[] args) {

        String[] strArray = new String[10];

        ArrayList<String> strList = new ArrayList<>();      // 데이터의 순서와
        strList.add("test1");

        // 배열<-> 리스트 변환             // 배열을 리스트로 바꿀 수 있다.
        List<String> list = Arrays.asList(strArray);        // 매개변수 타입때문에 변경되고, 한가지더,
        ArrayList<String> list2 = new ArrayList<>();
        list2.addAll(list);

        String[] strArray2 = strList.toArray(new String[strList.size()]);

        // 리스트 값 조회
        System.out.println(strList);

        // contains 포함 여부
        System.out.println(strList.contains("test1"));

        // 리스트 바로 생성
        List<Integer> nums = List.of(1,2,3,4,5);
        System.out.println(nums);

        // 제거
//        strList.remove()   => 리턴 타입이 String
//        nums.remove        => 리턴 타입이 Int      죽, 제네릭 타입으로 받고있다.

        strList.add("황인수");
        strList.add("박인수");
        strList.add("최인수");
        System.out.println(strList);
        System.out.println(strList.remove("test1"));
        System.out.println(strList);
        System.out.println(strList.remove(1));
        System.out.println(strList);
        System.out.println();

        System.out.println(nums);
        List<Integer> nums2 = List.of(1,3,5);
        ArrayList<Integer> nums3 = new ArrayList<>();
        nums3.addAll(nums);
        System.out.println(nums3.removeAll(nums2));
        System.out.println(nums3);

        // 수정
        nums3.set(0, 10);
        System.out.println(nums3);
        nums3.addAll(List.of(1, 2, 3));
        System.out.println(nums3);
        System.out.println();

        // 반복
        for (int i = 0; i < nums3.size(); i++ ) {
            System.out.println(nums3.get(i));           // List 에서 get 해라 i 번째 인덱스 값을
        }
        System.out.println();
        for (Integer num : nums3) {
            System.out.println(num);
        }
        System.out.println();

        Iterator<Integer> ir = nums3.iterator();
        while (ir.hasNext()) {
            System.out.println(ir.next());          // next 해서 꺼내서 쓰고 싶을 때
        }
    }
}
