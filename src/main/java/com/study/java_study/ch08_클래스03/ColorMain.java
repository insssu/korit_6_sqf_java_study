package com.study.java_study.ch08_클래스03;

public class ColorMain {

    public static void main(String[] args) {
        /*
            문제
            Color 객체 5개를 담을 수 있는 배열을 생성하여
            #CA848A, Brandied Apricot
            #FFBE98, Peach Fuzz
            #964F4C, Marsale
            #A78C78, Almandine
            #DBC88D, Almand peach
            색상 데이터를 저장 한 후에 for문을 사용하여 배열에 들어있는
            모든 색상 정보를 printInfo()로 호출하여 출력한다.
            이후에 모든 code와 name의 값을 null로 바꾸어 다시 출력한다.
            이때 null로 바꿀때에는 반복문을 사용한다.

         */
/*
        Color[] color = new Color[] {
                new Color("CA848A", "Brandied Apricot"),
                new Color("FFBE98", "Peach Fuzz"),
                new Color("964F4C","Marsale"),
                new Color("A78C78","Almandine"),
                new Color("DBC88D","Almand peach")
        };
        for(int i = 0; i < color.length; i++) {
            if(color[i] == null) {
                continue;
            }
            color[i].printInfo();
            System.out.println();
        }
        for(int i = 0; i < color.length; i++){
            color[i] = null;
        }

    }
}
*/

    Color[] colors = new Color[5];
    colors[0] = new Color("CA848A", "Brandied Apricot");
    colors[1] = new Color("FFBE98", "Peach Fuzz");
    colors[2] = new Color("964F4C","Marsale");
    colors[3] = new Color("A78C78","Almandine");
    colors[4] = new Color("DBC88D","Almand peach");

    for(Color color : colors) {
        color.printInfo();
    }

    for(int i = 0; i < colors.length; i++)
        colors[i].printInfo();


    for(Color color : colors) {         // for each 반복문은 처음부터 끝까지 반복해야 하거나
        color.setCode(null);            // 인덱스가 필요없는 경우 사용하는것이 좋다.
        color.setName(null);
    }
        System.out.println();

    for(int i = 0; i < colors.length; i++) {
        colors[i].printInfo();
    }

    for(Color color : colors) {
        color.printInfo();
    }
    }
}