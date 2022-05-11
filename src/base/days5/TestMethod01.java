package base.days5;

public class TestMethod01 {
    /*
    1、方法是对特定的功能进行提取，形成一个代码片段，这个代码片段就是我们所说的方法
    2、方法和方法是并列的关系，所以我们定义的方法不能写到main方法中
    3、方法的定义--》 格式：
    修饰符 方法返回值类型 方法名(形参列表){
        方法体;
        return 方法返回值;
    }
    4、方法的作用：提高代码的复用性
    5、总结方法定义的格式：
    1) 修饰符：暂时使用Public static ---> 面向对象一章讲解
    2) 方法返回值类型： 方法的返回值对应的数据类型
        数据类型：可以是基本数据类型(byte,short,int,long,float,double,char,boolean)也可以是引用数据类型
    3) 方法名：见铭之义，首字母小写，其余遵循驼峰命名，eg: addNum,一般尽量使用英文来命名
    4） 形参列表：方法定义的时候需要的形式参数：int num1, int num2 --》 相当于告诉方法的调用者：需要引入几个参数，需要传入的参数的类型
        实际参数：方法调用的时候参入的具体参数： 10,20 --》 根据形式参数的需要传入的
    5）方法体：具体的业务逻辑代码
    6） return 方法返回值
    方法如果有返回值的话：retrun+
     */

    // 方法的定义
    public static  int add(int num1,int num2){
        int sum = 0;
        sum += num1;
        sum += num2;
        return sum;
    }

    public static void main(String[] args) {
//        int num1 = 10;
//        int num2 = 20;
//        int sum = 0;
//        sum+=num1;
//        sum+=num2;
//        System.out.println(sum);
//
//        int num3 = 30;
//        int num4 = 90;
//        int sum1 = 0;
//        sum1 += num3;
//        sum1 =+ num4;
//        System.out.println(sum1);

        int num = add(10,20);
        System.out.println(num);

        int sum = add(30,90);
        System.out.println(sum);

        System.out.println(add(50,48));
    }
}
