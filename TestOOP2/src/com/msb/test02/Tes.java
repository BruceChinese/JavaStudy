package com.msb.test02;

public class Tes {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("nana");
        s1.setAge(19);
        s1.setSex("女asdasd");
        System.out.println(s1.getName()+"==========="+s1.getAge()+"=========="+s1.getSex());


        Student s2  = new Student(18,"菲菲","女sdasd");
        System.out.println(s2.getName()+"==========="+s2.getAge()+"=========="+s2.getSex());
    }
}
