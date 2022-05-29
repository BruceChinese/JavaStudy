package com.msb.test03;

public class Test {
    public static void main(String[] args) {
        // 创建子类Student的对象
        Student s = new Student();
        s.setSno(1001);
        s.setAge(18);
        s.setName("菲菲");
        s.setHeight(180.4);

        System.out.println("学生名字为:"+s.getName()+",学生的年纪: "+s.getAge());

        // 访问方法
        s.study();
        s.eat();
        s.sleep();
    }
}
