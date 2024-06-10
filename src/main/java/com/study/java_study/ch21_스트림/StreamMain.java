package com.study.java_study.ch21_스트림;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMain {
    public static void main(String[] args) {

        /*
         스트림을 쓰기위해 알아야 하는 세가지 구조

         생성(사용) 절차
         1. 배열 생성 -> 스트림으로 변환
         2. List 생성 -> 스트림으로 변환
         3. generate 메소드 -> 스트림 생성
         4. 범위 지정 -> 스트림 생성
         5. 빌더 -> 스트림 생성

         중간(가공) 절차
         1. map(Function)    *
         2. filter(Predicate)    *
         3. sorted(Comparator)

         최종(결과) 절차
         1. collect() -> stream을 list로 변환
         2. 반복자 -> forEach

         핵심 : 반복작업을 하기 위해 사용한다. 스트림이라고 하는 데이터의 묶음을 반복을 돌리면서 새로운 스트림을
         만들 수도 있고, 조건에 맞는 필터링 된 스트림을 만들 수 있고, 새로운 정렬을 통해 스트림을 만들 수 있다.

        */

        Stream<Integer> st1 = Arrays.stream(new Integer[]{1, 2, 3, 4, 5}); // 스트림 생성 위치
        List<Integer> numberList = st1.map(n -> n * 2)     // 가공 위치 / 스트림에서 n에 하나씩 꺼내어 쓰고 결과를 새로운 스트림에 하나씩 담는과정을 반복하는 것.
                .peek(n -> System.out.println(n))   // 가공(기타 스트림 메소드) 없어도 상관없는 peek/ 담을때 마다 결과값을 출력할 것이다.
                .collect(Collectors.toList());      // 최종
        // peek는 스트림을 실행하는 중간중간에 결과를 확인하는 것
        numberList.forEach(n -> System.out.println("n : " + n));
        System.out.println();

        List<Integer> filteringNumber = numberList.stream()
                .map(n -> n / 2)
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());

        System.out.println(filteringNumber);
        System.out.println();

        List<Integer> sortedNumberList = numberList.stream()
                .sorted((o1, o2) -> o2 - o1)
                .collect(Collectors.toList());
        System.out.println(sortedNumberList);
        System.out.println();

        Stream<String> nameStream = Stream.<String>builder()
                .add("손경태")
                .add("최단비")
                .add("김지현")
                .add("정현우")
                .add("이성민")
                .build();
//        nameStream.sorted().forEach(name -> System.out.println(name)); 정렬
        nameStream.sorted((o1, o2) -> Objects.hash(o2) - Objects.hash(o1)) // 역정렬
                .forEach(name -> System.out.println(name));

        List<Phone> phoneList = List.of(
                Phone.builder().number(1).model("아이폰").build(),
                Phone.builder().number(2).model("겔럭시").build(),
                Phone.builder().number(3).model("샤오미").build()
        );

        phoneList.stream()
                .map(phone -> Phone.builder()
                    .number(phone.getNumber() * 3)
                    .model(phone.getModel())
                    .build())
                .forEach(phone -> System.out.println(phone));
        System.out.println();


        phoneList.stream()
                .filter(phone -> phone.getNumber() % 2 != 0)
                .forEach(phone -> System.out.println(phone));
        System.out.println();

        phoneList.stream()
                .sorted((o1, o2) -> o2.getNumber() - o1.getNumber())
                .forEach(phone -> System.out.println(phone));  // number를 기준으로 역정렬
        System.out.println();

        phoneList.stream()
                .sorted((o1, o2) -> String.CASE_INSENSITIVE_ORDER.compare(o1.getModel(), o2.getModel()))
                //.forEach(phone -> System.out.println(phone));
                .forEach(System.out :: println); // stream 안에서의 람다. 내가 쓰고자 하는 함수만 써주면 된다.

    }
}
