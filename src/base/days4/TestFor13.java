package base.days4;

public class TestFor13 {
    public static void main(String[] args) {
/*        for (int j = 1; j <= 4; j++) {
            for (int i = 0; i < 5; i++) {
                System.out.print(" ");
            }

            for (int i = 1; i <= 9; i++) {
                System.out.print("*");
            }
            System.out.println();
        }*/


        for(int j = 1; j<=4;j++){
            for(int i=1; i<=(9-j);i++){
                System.out.print(" ");
            }
            for(int i=1;i<=9;i++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
