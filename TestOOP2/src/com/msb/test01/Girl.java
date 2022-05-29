package com.msb.test01;

public class Girl {
     private int age;
     private int sno;
     private String name;
     private double height;

     public int getSno() {
          return sno;
     }

     public void setSno(int sno) {
          this.sno = sno;
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

     public int duquAge(){
          return age;
     }
     public void shezhiAge(int age){
          if(age>=30){
               this.age = 18;
          }else{
               this.age = age;
          }
//          this.age = age;
     }

}
