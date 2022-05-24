package com.msb4;

public class Person {
    int age;
    String name;
    double height;

    public  Person(){

    }
    public Person(int age,String name,double height){
        this.age =age;
        this.name = name;
        this.height = height;
    }

    public Person(int age,double height){
        this.age =age;
        this.height = height;
    }

    public Person(int age){
        this.age =age;
    }
//
//    public void eat(){
//        int age= 10;
//        System.out.println(age);
//        System.out.println(this.age);
//        System.out.println("我喜欢吃饭");
//
//    }

    public void play(){
        this.eat();
        System.out.println("吃饭");
        System.out.println("上网");
        System.out.println("洗澡");
    }

    public void eat(){
//        System.out.printf(age);
        System.out.println("吃饭");
    }

}
