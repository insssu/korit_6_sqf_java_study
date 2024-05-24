package com.study.java_study.ch06_배열;

public class ArrayMain02 {
    public static void main(String[] args) {
        // "김준일" => 주소는 999
        String a = "김준일";               // 999
        String b = new String("김준일");   // 200 -> 999
        // String b 는 200의 주소를 가지고 그 주소(200) 안에 있는 값이 999

        System.out.println(a);
        System.out.println(b);

        System.out.println(a == "김준일");     //true
        System.out.println(b == "김준일");     //false
        System.out.println(a == b);         // false

        String[] names = new String[2];         // string을 담을 수 있는 공간 2개를 확보해 두었다. 0번 인덱스에 "김준일", 1번 인덱스에 "김준일"
        names[0] = "김준일";
        names[1] = new String("김준일");

        String[] names2 = {"김준일", new String("김준일")};  // new String[] {}~ 뉴스트링 부분은 생략이 된 경우. 크기를 알아서 할당하기 때문에 [] 안에 수를 입력하면 오류가 난다.

        System.out.println(names[0] == names2[0]);      // 배열 안의 값 모두 999로 동일하므로 true
        System.out.println(names[1] == names2[1]);      //
        System.out.println(names == names2);

        int n = 10;
        n = n + 1;
        n++;
        n += 1;

        System.out.println(new String[2]);      //[Ljava.lang.String;@7c30a502 배열의 주소는 [ 대괄호 여는것으로 시작함.
        System.out.println(new String[]{"a", "b"});

    }

}
