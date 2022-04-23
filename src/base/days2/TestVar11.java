package base.days2;

import java.util.Scanner;

public class TestVar11 {
    public static void main(String[] args) {

        // 提取变量：提取变量，就是为了一劳永逸，以后只要改变变量的值，下面只要用到这个变量的地方，取值也就发生了变化
        // 一个变量被final修饰，这个变量就变成了敞亮，这个常量的值就不可变了
        // 这个常量就是我们常说的字符常量
        final double pi = 3.1415926;
        Scanner sc = new Scanner(System.in);
        System.out.print("请录入一个半径: ");
        int r = sc.nextInt();
        // 让扫描器扫描键盘录入的int类型的数据
//        int r = 8;
        // 现在功能：求圆的周长和面积
        double c =  2*pi*r;
        System.out.println("周长为: " +c);

        double s= pi*r*r;
        System.out.println("面积为:"+s);
    }

}

