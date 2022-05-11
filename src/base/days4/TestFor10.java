package base.days4;

import java.util.Scanner;


public class TestFor10 {
    public static void main(String[] args) {
        int count = 0;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.println("请录入第"+i+"个数:");
            int num = sc.nextInt();
            if(num==666){
//                return;
                break;
            }
            if(num>0){
                count++;
        }

        }
        System.out.println("你录入的整数的个数是: "+count);
    }

}
