package base.days3;

import java.util.Scanner;

public class TestOpe02 {
    public static void main(String[] args) {
    // 实现功能：任意给出一个四位数，求出每位数上的数字并输出
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个数字: ");
        int num = sc.nextInt();
//        int num = 1234;
        int num1 = num%10;
        int num2 = num/10%10;
        int num3 = num/100%10;
        int num4 = num/1000;

        System.out.println("个位上的数位: "+num1);
        System.out.println("十位上的数位: "+num2);
        System.out.println("百位上的数位: "+num3);
        System.out.println("千位上的数位: "+num4);
    }
}
