package base.days4;

public class TestDoWhile {
    public static void main(String[] args) {
    /*    int i = 1;
        int sum = 0;
        while (i<=100){
            sum+=i;
            i++;
        }
        System.out.println(sum);*/

        int i = 101;
        int sum = 0;
        do{
            sum+=i;
            i++;
        }while (i<=100);
        System.out.println(sum);
        // while和do-while的区别：
        // while：先判断，在执行
        // do-while 先执行，在判断 至少被执行一次，从第二次才开始判断
    }
}
