package com.study.java_study.ch04_제어;

public class Star {

    public static void main(String[] args) {

        /*

        *
        **
        ***
        ****
        *****



        for(int i = 0; i < 5; i++) {
            int num = i + 1;
            System.out.println("*" * num);
            */

        for(int i = 0; i < 5; i++) {
            for(int j = 0; j < i + 1; j++) {
                System.out.print("*");              // print()는 줄바꿈을 하지않는다.
            }
            System.out.println();


        }

        /*

         *****
         ****
         ***
         **
         *

         */
        for(int i = 0; i < 5; i++) {
            for(int j = 0; j < (5 - i); j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        /*

             *
            **
           ***
          ****
         *****

         */

        for(int i = 0; i < 5; i++) {
            for(int j = 0; j < 5 - (i + 1); j++) {
                System.out.print(" ");
            }
            for(int k = 0; k < i + 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // 풀이
        for(int i = 0; i < 5; i++) {                // 5의 값이 반복되므로 변수로 바꿔줄 수 있다.
            for (int j = 0; j < 5 - 1 - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 1 + i; j++) {       // 첫 번째 for문 안에서 j와
                System.out.print("*");              // 두 번째 for문 안의 j는 '다른 지역'에서 사용되고 있기 때문에
            }                                       // 같은 변수명을 사용할 수 있다.
            System.out.println();                   // '같은 지역'에서 같은 변수명은 사용할 수 없으니 주의.
        }

            /*
             *****
              ****
               ***
                **
                 *
             */

            for(int i = 0; i < 5; i++) {
                for(int j = 0; j < i; j++) {
                    System.out.print(" ");
                }
                for(int k = 0; k < 5 - i; k++) {
                    System.out.print("*");
                }
                System.out.println();
            }

            // 풀이
            for(int i = 0; i < 5; i++) {            // 공백이 하나씩 증가
                for(int j = 0; j < i; j++) {
                    System.out.print(" ");
                }
                for(int j = 0; j < 5 - i; j++) {        // 별이 하나씩 감소
                    System.out.print("*");
                }
                System.out.println();
            }



            /*
                 *      i = 0
                ***     i = 1
               *****
              *******
             *********
             */

            for(int i = 0; i < 5; i++) {
                for(int j = 0; j < 5 - (i + 1); j++) {
                    System.out.print(" ");
                }
                for(int k = 0; k < 2 * (i + 1) - 1; k++) {          // 2-1 4-1 6-1
                    System.out.print("*");
                }
                System.out.println();
            }




            /*
             *********
              *******
               *****
                ***
                 *
             */
            for(int i = 0; i < 5; i++) {
                for(int j = 0; j < i; j++) {
                    System.out.print(" ");
                }
                for(int k = 0; k < 2 * (5 - (i + 1)) + 1; k++) {
                    System.out.print("*");
                }
                System.out.println();
            }


    }
}
