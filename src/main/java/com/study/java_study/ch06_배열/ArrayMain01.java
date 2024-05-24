package com.study.java_study.ch06_배열;

public class ArrayMain01 {

    public static void main(String[] args) {
        int[] nums = new int[100] ;                  // 모든 자료형은 배열로 만들 수 있다. []를 사용하여 크기를 지정한다.

        for(int i = 0; i < 100; i++) {
            nums[i] = (i + 1) * 10;
        }

        for(int num : nums) {                       // 처음부터 끝까지 무조건 다 담아야 하는 경우 for Each(for(int))문을 쓴다.
            System.out.println(num);
        }

        for(int i = 0; i < nums.length; i++) {      // 배열.length -> 배열의 크기
            if(i % 2 == 0) {
                continue;           // i가 짝수면 출력안한다는 의미
            }
            int num = nums[i];
            System.out.println(num);
        }
        /*
        nums[1] = 20;                               // 인덱스가 있기 때문에 반복을 돌릴 수 있다. 배열을 쓰는 이유는 반복때문 !

        System.out.println(nums[0]);                // 대괄호[]를 통해 인덱스를 참조한다.
        System.out.println(nums[1]);
        System.out.println(nums[2]);
        System.out.println(nums[3]);

         */
    }
}
