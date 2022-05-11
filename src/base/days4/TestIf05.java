package base.days4;

import java.util.Scanner;

public class TestIf05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请录入小朋友的年龄: ");
        int age = sc.nextInt();
        if(age>=7){
            System.out.println("Yes");
        }else if (age>=5){
            System.out.print("请录入小朋友的性别: 男: 1 女: 0");
            int sex = sc.nextInt();
            if(sex == 1){
                System.out.println("yes");
            }else{
                System.out.println("no");
            }
        }else{
            System.out.println("no");
        }
    }
}
