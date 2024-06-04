package com.study.java_study.ch18_빌더;

public class DataMain {

    public static void main(String[] args) {
        Data data = new Data("a", 10, 10.5, "b");
//        Data data = new Data("a", 10, 10.5, null);
        Data data2 = new Data();
        data2.setData1("a");
        data2.setData3(3.14);       // 원하는 값에만 데이터를 넣고싶을 때 노아규, 세터 설정. 이 과정을 묶자는 것이 '빌더'

        DataEntity dataEntity = DataEntity.builder()
                .data1("a")
                .data2(10)
                .data3(10.5)
                .data4("d")
                .build();

        DataEntity2 dataEntity2 = DataEntity2.builder()
                .data1("a")
                .data2(10)
                .data3(3.14)
                .data4("b")
                .build();

    }
}
