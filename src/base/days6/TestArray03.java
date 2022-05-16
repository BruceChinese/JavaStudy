package base.days6;

import java.util.Scanner;

public class TestArray03 {
    public static void main(String[] args) {
        int[] scores = new int[10];
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.printf("请输入第%d个学生的成绩: ",i);
            int score = sc.nextInt();
            scores[i] = score;
            sum+=score;
        }
        System.out.println("10个学生的成绩之和为: "+sum);
        System.out.println("10个学生的成绩平均数为:"+sum/10);
        System.out.println(scores[5]);
        for (int i = 0; i < 10; i++) {
            System.out.printf("第%d个学生的成绩是:%d\n",i+1,scores[i]);
        }

        for(int num:scores){
            System.out.println(num);
        }

        for(int i =10;i>=1;i--){
            System.out.printf("第%d个学生的成绩是:%d\n",i,scores[i]);
        }
    }
}
