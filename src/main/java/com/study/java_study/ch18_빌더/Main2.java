package com.study.java_study.ch18_빌더;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main2 {

    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> numbers2 = new ArrayList<>();

        for (Integer n : numbers) {     // numbers 를 하나씩 다 꺼내서 대입해준 다음
            numbers2.add(n * 2);
        }

        List<Integer> numbers3 = numbers.stream().map(n -> n * 2).collect(Collectors.toList());     // stream 을 쓰면 간략하게 쓸 수 있고, 활용하기가 편해진다.

        System.out.println(numbers);
        System.out.println(numbers2);
        System.out.println(numbers3);
    }
}
