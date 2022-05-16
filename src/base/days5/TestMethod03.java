package base.days5;

import java.util.Scanner;

public class TestMethod03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请你才一个数: ");
        int yourGuessNum = sc.nextInt();
        guessNum(yourGuessNum);


    }

    public static void guessNum(int yourNum){
        int myHeartNum = (int)(Math.random()*6)+1;
        System.out.println(yourNum==myHeartNum?"猜对了":"猜错了");
    }
}
