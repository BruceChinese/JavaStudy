package com.msb.test03;

public class Student extends Person {
    private int sno;

    public int getSno() {
        return sno;
    }

    public void setSno(int sno) {
        this.sno = sno;
    }

    public void study(){
        System.out.println("学生可以学习");
    }
}
