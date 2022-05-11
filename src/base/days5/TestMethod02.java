package base.days5;

public class TestMethod02 {
    public static void add(int num1,int num2){
        int sum = 0;
        sum+=num1;
        sum+=num2;
        System.out.println(sum);
        return;
    }
    public static void main(String[] args) {
        add(10,20);
        add(290,50);

    }
}
