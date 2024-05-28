package com.study.java_study.ch06_배열;

public class ArrayMain03 {

    public static void main(String[] args) {
        int[] nums = new int[] { 10, 20, 30, 40, 50, 60 };

        int num1 = 10;
        int num2 = 20;
        int num3 = 30;
        int num4 = 40;
        int num5 = 50;
        int num6 = 60;

        // 두 코드는 같다. 차이점은 개별적으로 만들어주면 '무작위 공간'으로 들어가기 때문에 순서가 없지만
        // 새로운 배열을 만들어 주면 '순서'를 정해줄 수 있다.
        // 순서가 없다면 반복을 할 수가 없다. 반복쓸 일이 없다면 배열을 사용할 필요가 없다.
        // 배열은 관련된 데이터를 하나로 묶어주기 위한 것이다.

        nums[0] = 10;
        nums[1] = 20;
        nums[2] = 30;
        nums[3] = 40;
        nums[4] = 50;
        nums[5] = 60;

        String[] strArray = new String[5];  // 공간을 다섯개 만들거다.
        strArray[0] = "가";
        strArray[1] = "나";
        strArray[2] = "다";
        strArray[3] = "라";
        strArray[4] = "마";

        for(int num : nums) {
            System.out.println(num);
            // if() {} break; 조건을 넣어서 반복을 멈추고 싶다할때
        }

        for(String str : strArray) {
            System.out.println(str);
        }

        double[] doubles = new double[3];
        doubles[0] = 10.5;
        doubles[1] = 20.5;
        doubles[2] = 30.5;

        for(double dNum : doubles) {
            System.out.println(dNum);
        }

        Computer[] computers = new Computer[3];
        computers[0] = new Computer("i3", "808");
        computers[1] = new Computer("i3", "808");
        computers[2] = new Computer("i3", "808");

        for(Computer computer : computers) {
            System.out.println(computer);
        }
    }
}
