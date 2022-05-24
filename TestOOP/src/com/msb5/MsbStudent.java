package com.msb5;

public class MsbStudent {
    String name;
    int age;
    static String school;

    public static void main(String[] args) {
        MsbStudent.school =  "马士兵教育";

        MsbStudent s1 = new MsbStudent();
        s1.name = "张三";
        s1.age = 19;
//        s1.school = "马士兵教育";

        MsbStudent s2 = new MsbStudent();
        s2.name = "李四";
        s2.age = 20;
//        s2.school = "马士兵教育";

        System.out.println(s2.school);



    }
}
