package com.msb.test03;

public class Person {

    // 属性
    private int age;
    private String name;
    private double height;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    // 方法

    public void eat(){
        System.out.println("可以吃饭、、、");
    }

    public void sleep(){
        System.out.println("可以睡觉。。");
    }
}
