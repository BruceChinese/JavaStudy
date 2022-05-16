package base.days6;

import java.util.Scanner;

public class TestArray01 {
    public static void main(String[] args) {
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.printf("请录入第%d个学生的成绩: ",i);
            int score1 = sc.nextInt();
            sum += score1;
        }
        System.out.println("10个学生的成绩和为:"+sum);
        System.out.println("10个学生的成绩平均数为: "+sum/10);




    }
}
