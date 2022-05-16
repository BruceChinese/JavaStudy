package base.days5;

public class TestMethod05 {
    public static void main(String[] args) {
        int sum = add(10,20);
        System.out.println(sum);
    }

    public static int add(int num1,int num2){
        return num1+num2;
    }

    public static int add2(int num1,int num2,int num3){
        return  num1+num2+num3;
    }
}


/*
总结：
1、方法的重载：在同一个类中，方法名相同，形参列表不同的多个方法，构成了方法的重载
2、方法的重载只跟：方法名和形参有关，与修饰符，返回值类型无关
3、注意：形参列表不同指的是什么？
    （1） 个数不同
    add() add(int num1) add(int num1,int num2)
    (2) 顺序不同
    add(int num1,double num2) add(double num1, int num2)
    (3) 类型不同
     add(int num1) add(double num1)

 */