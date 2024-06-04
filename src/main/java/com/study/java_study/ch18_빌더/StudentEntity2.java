package com.study.java_study.ch18_빌더;

public class StudentEntity2 {
    private int studentCode;
    private String name;
    private int age;

    public StudentEntity2(int studentCode, String name, int age) {
        this.studentCode = studentCode;
        this.name = name;
        this.age = age;
    }

    public static class StudentBuilder {
        private int studentCode;
        private String name;
        private int age;
    }

    /* 내가 한 것
    public StudentEntity2(int studentCode, String name, int age) {
        this.studentCode = studentCode;
        this.name = name;
        this.age = age;
    }

    public static StudentBuilder builder() { return new StudentBuilder();}

    public static class StudentBuilder {
        private int studentCode;
        private String name;
        private int age;

        public StudentEntity2 build() {
            return new StudentEntity2(studentCode, name, age);
        }
        public StudentBuilder studentCode(int studentCode) {
            this.studentCode = studentCode;
            return this;
        }
        public StudentBuilder name(String name) {
            this.name = name;
            return this;
        }
        public StudentBuilder age(int age) {
            this.age = age;
            return this;
        }
    }
    */

}
