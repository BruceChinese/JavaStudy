package base.days4;

public class TestIf02 {
    public static void main(String[] args) {
        // 随机给出三个数，对三个数求和计算，根据和的大小来分配不同的奖品
        int num1 = 2;
        int num2 = 4;
        int num3 = 5;
        int sum = 0;
        sum += num1;
        sum += num2;
        sum += num3;
        System.out.println("和为: "+sum);


        if(sum>=14){
            System.out.println("一等奖");
        }else if(sum>=10) {
            System.out.println("二等奖");
        }else if(sum>=6){
            System.out.println("三等奖");
        }else{
            System.out.println("四等奖");
        }
    }
}
