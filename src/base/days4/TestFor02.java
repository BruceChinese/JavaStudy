package base.days4;

public class TestFor02 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
            if(sum>300){
                break;
            }
        }
        System.out.println(sum);
    }
}
