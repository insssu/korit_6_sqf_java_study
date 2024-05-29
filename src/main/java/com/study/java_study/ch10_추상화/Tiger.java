package com.study.java_study.ch10_추상화;

public class Tiger extends Animal {
    /*
    private String name;
    private int age;

     */
    private int power;

    public Tiger() {
        super();        // 생략되어 있는 부모객체 생성자 Animal 객체 생성자 호출
                        // 같은 의미로 this는 본인 class 안에 자신을 가리키는 것이고, super은 부모객체를 호출하는 생성자.
        System.out.println("호랑이 객체 생성");

        /*
        System.out.println("호랑이 객체 생성");
        super();
        이 순서는 안된다. 부모객체가 먼저 생성된 후에 자식 객체가 생성돼야 하기 때문에 super() 생성자가 가장 위로 와야한다.
         */
    }

    public Tiger(String name, int age, int power) {
        super(name, age);
        this.power = power;
    }

    // 재정의 -> 상속관계 에서만 가능한 것.
    @Override       // @ 란 어노테이션이라고 한다. 재정의 했다는 것을 알려주기위해 @Override를 사용. 특별한 기능을 가지고있는 것은 아니다.
    public void move() {
        System.out.println("꽁꽁 얼어붙은 한강위로 호랑이가 네발로 뛰어갑니다.");
        super.move();           // 부모가 가지고있는 것을 그대로 쓰고싶다면 본인 클래스 안에서 super. 을 해준다.
                                // 생성할때만 super()의 위치가 중요하지만 호출 할 때는 순서상관은 없다.
    }



    @Override
    public String toString() {
        return "Tiger{" +
                "power=" + power +
                "} " + super.toString();
    }
    /*
    public Tiger(String name, int age, int power) {
        this.name = name;
        this.age = age;
        this.power = power;
    }

    @Override
    public String toString() {
        return "Tiger {" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", power=" + power +
                '}';
    }

     */
}
