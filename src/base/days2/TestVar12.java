package base.days2;

import java.util.Scanner;

public class TestVar12 {
    public static void main(String[] args) {
        // 键盘录入学生的信息：姓名、年龄、性别、身高
        Scanner sc = new Scanner(System.in);
        System.out.print("请录入年龄： ");
        int age = sc.nextInt();
        // 键盘录入的身高
        System.out.print("请录入身高：");
        double height = sc.nextDouble();
        System.out.print("请录入姓名: ");
        String name = sc.next();
        // 键盘录入性别
        System.out.print("请录入性别: ");
//        String sexStr = sc.next();
//        char sex = sexStr.charAt(0);
        // 上面两句可以合并为一句：
        char sex = sc.next().charAt(0);
        System.out.println("该学生的信息为:\n姓名是: "+name+"\n年龄: "+age+"\n身高:"+height+"\n性别:"+sex);

    }

}

