package base.days4;

public class TestFor05 {
    public static void main(String[] args) {
/*        long time1=System.currentTimeMillis();
        for (int i = 1; i < 101; i++) {
//            System.out.println(i);
            if(i%6==0){
                System.out.println(i);
            }
        }
        long time2 = System.currentTimeMillis();
        System.out.println(time2);
        System.out.println(time1);
        System.out.println(time2-time1);*/

        for (int i = 1; i <= 100; i++) {
            if(i%6!=0){
                continue;
            }
            System.out.println(i);

        }
    }
}
