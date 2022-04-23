package base.days2;

public class TestVar05 {
    public static void main(String[] args) {
        // 定义整数类型的变量
        // 给变量赋值的时候，值可以为不同机制的
        int num1 = 12; // 默认情况下赋值就是十进制
        System.out.println(num1);
        int num2 = 012; // 前面加上0就是八进制
        System.out.println(num2);
        int num3 = 0x12; // 0x 0X 十六进制
        System.out.println(num3);
        int num4 = 0b10; // 0b 0B 二进制
        System.out.println(num4);


        // 定义byte类型的变量
        byte b = 123;
        System.out.println(b);
        // 注意：超出范围的赋值会报错
        short s = 300;
        System.out.println(s);
        int i  = 123112;
        System.out.println(i);
        long num5 = 123122L;
        System.out.println(num5);
        long num6 = 12312312;
        System.out.println(num6);
    }
}
