package base.days4;

import java.util.Scanner;

public class TestIf04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("输入会员积分: ");
        // 先判断键盘键入的是不是int类型的
        if (sc.hasNextInt() == true) {
            String discount = "";
            int score = sc.nextInt();
            if(score >=0){
                if (score >= 8000) {
                    discount = "0.6";
                } else if (score >= 4000) {
                    discount = "0.7";
                } else if (score > 2000) {
                    discount = "0.8";
                } else {
                    discount = "0.9";
                }
                System.out.println("该会员享受的折扣是: "+discount);
            }else{
                System.out.println("对不起，你录入的积分是负数！不符合要求");
            }
        } else {
            System.out.println("你录入的积分不是整数");
        }
    }
}
