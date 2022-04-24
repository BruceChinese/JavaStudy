package base.days3;

import java.util.Scanner;

public class TestOps12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请选择今晚上吃什么： 1、火锅 2、烧烤 3、麻辣烫 4、西餐");
        System.out.println("请男孩选择: ");
        int boyChoice = sc.nextInt();
        System.out.println("请女孩选择: ");
        int girlChoice = sc.nextInt();
        System.out.println(boyChoice == girlChoice?"听男孩的":"听女孩的");
    }
}
