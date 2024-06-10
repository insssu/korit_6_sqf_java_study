package com.study.java_study.ch20_람다;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class LambdaInterface {
    public static void main(String[] args) {

//        Runnable runnable = new Runnable() {
//            @Override
//            public void run() {
//
//            }
//        }; 람다식으로 바꿀 경우 다음과 같다
        Runnable runnable = () -> {
            System.out.println("프로그램 실행");
            System.out.println("프로그램 종료");
        };

        runnable.run();
        System.out.println();

//        Function fx = new Function<String, Integer>() {
//            @Override
//            public Integer apply(String s) {
//                return Integer.parseInt(s);
//            }
//        }; 람다식으로 바꿀 경우 다음과 같다

//        Function<String, Integer> fx = (String s) -> {
//            return Integer.parseInt(s);
//        };
        Function<String, Integer> fx = s -> Integer.parseInt(s);
        // 명령어가 한줄이면 중괄호와 return; 을 생략할 수 있고,
        // 매개변수가 하나라면 소괄호를 생략할 수 있다.

        Integer num = fx.apply("10");
        System.out.println("num : " + num);

        Integer num2 = fx.andThen(result -> result + 100 ).andThen(result -> result + 1000).apply("10");
        // 'apply가 실행된 이후'에 result 실행
        System.out.println(num2);
        System.out.println();

//        Consumer<String> transform = new Consumer<String>() {
//            @Override
//            public void accept(String s) {
//                System.out.println(s + "님 환영합니다.");
//            }
//        };

        Consumer<String> transform = s -> {
            System.out.println(s + "서버에 접속하였음.");
            System.out.println(s + "님 환영합니다.");
        };

        transform.accept("황인수");



        Supplier<Integer> role = () -> {
            Integer result = num + 999;
            return result;
        };
        System.out.println(role.get());
        System.out.println();

        Predicate<Integer> even = n -> n % 2 == 0;
        System.out.println(even.test(10));
    }
}
