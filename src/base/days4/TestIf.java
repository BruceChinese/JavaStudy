package base.days4;

public class TestIf {
    public static void main(String[] args) {
        // 随机给出三个数，对三个数求和计算，根据和的大小来分配不同的奖品
        int num1 = (int)(Math.random()*6)+1;
        int num2 = (int)(Math.random()*6)+1;
        int num3 = (int)(Math.random()*6)+1;
        int sum = 0;
        sum += num1;
        sum += num2;
        sum += num3;
        System.out.println("和为: "+sum);

        if (sum>=14){
            System.out.println("一等奖");
            System.out.println("恭喜你，获得一等奖");
        }

        if (sum>=10 && sum<14){
            System.out.println("二等奖");
        }

        if (sum>=6&&sum<10){
            System.out.println("三等奖");
        }
        if(sum<6){
            System.out.println("四等奖");
        }
    }
}
