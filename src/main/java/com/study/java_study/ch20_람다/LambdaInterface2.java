package com.study.java_study.ch20_람다;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class LambdaInterface2 {
    public static void main(String[] args) {

        Runnable runnable = () -> {


            System.out.println("환영합니다.");
        };

        runnable.run();
        System.out.println();

        Function<String, Integer> num3 = s -> Integer.parseInt(s);
        Integer n = num3.apply("10");
        System.out.println("n : " + n);
        System.out.println();


        Consumer<String> transform = s -> {
            System.out.println(s + "님 안녕하세요");
        };
        transform.accept("황인수");


        Supplier<Integer> num1 = new Supplier<Integer>() {
            @Override
            public Integer get() {
                Integer result = n + 99;
                return result;
            }
        };
        System.out.println(num1.get());
        System.out.println();

        Predicate<Integer> event = n2 -> n2 % 3 == 0;
        System.out.println(event.test(10));

    }


}
