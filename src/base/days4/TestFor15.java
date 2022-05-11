package base.days4;

public class TestFor15 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int b = 3; b <= 6; b++) {
                if(i+b==7){
                    System.out.println(i+"-------------------"+b);
                }
            }
        }
    }
}
