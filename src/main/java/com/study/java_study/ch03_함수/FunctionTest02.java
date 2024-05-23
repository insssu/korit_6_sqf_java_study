package com.study.java_study.ch03_함수;

public class FunctionTest02 {
         // test01에서 10, 20을 가져왔고
    int getAddData(int a, int b) {
        FunctionTest03 functionTest03 = new FunctionTest03();

        return functionTest03.add(a, b);
        //   (functionTest03.add) 값은 30
    }

}
