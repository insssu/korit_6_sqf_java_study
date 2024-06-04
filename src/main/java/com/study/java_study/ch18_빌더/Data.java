package com.study.java_study.ch18_빌더;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor // 생성과 동시에 데이터를 입력하고 싶을 때
@Setter
public class Data {

    private String data1;
    private int data2;
    private double data3;
    private String data4;

//    public Data(String data1) {
//        this.data1 = data1;
//    }
//    public Data(int data2) {
//        this.data2 = data2;
//    }
//    public Data(double data3) {
//        this.data3 = data3;
//    }
//    public Data(String data4) {           1번 데이터에도 String이기 때문에 둘 중 어느것을 받아올지 모른다.
//        this.data4 = data4;               따라서 이런 데이터 생성방식은 사용하지 않는다.
//    }
}
