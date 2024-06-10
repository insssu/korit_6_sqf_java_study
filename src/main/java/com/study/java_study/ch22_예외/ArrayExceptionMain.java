package com.study.java_study.ch22_예외;

    /*
        예외(오류)
        1. 컴파일 오류 -> 프로그램이 실행(메모리에 할당)되기 전에 나는 오류. 문법적 오류 or 메모리 부족
        2. 런타임 오류 -> 프로그램이 실행(메모리에 할당)된 후에 오류. 실행중에 메모리가 부족 or 해서는 안될짓을 했을 때.


    */


public class ArrayExceptionMain {

    public static void printArray(Integer[] nums, int length) throws Exception { // throws => 이 메소드를 처리하려면 호출하는 곳에서 반드시 예외처리를 해줘야 한다는 뜻
            for (int i = 0; i < length; i++) {
                System.out.println("i : " + nums[i]);
            }
        }

    public static void main(String[] args) throws Exception {
        Integer[] nums = new Integer[] {1, 2, 3, 4, 5};

        try {
            printArray(nums, 6);
        } catch (Exception e) {
            e.printStackTrace();
        }



        System.out.println("프로그램 종료");
    }
}

