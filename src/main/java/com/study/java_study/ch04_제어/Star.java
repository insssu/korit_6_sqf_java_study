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

        for(int i = 0; i < 5; i++) {
            for(int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for(int k = 0; k < 5 - i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i = 0; i < 5; i++) {
            for(int j = 0; j < 5 - (i + 1); j++) {
                System.out.print(" ");
            }
            for(int k = 0; k < i + (i + 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}


