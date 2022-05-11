package base.days4;

public class TestFor12 {
    public static void main(String[] args) {
        for (int j = 9; j >=1; j--) {
            for (int i = 1; i <=j; i++) {
                System.out.print(i+"*"+j+"="+i*j+"\t");
            }
            System.out.println();

        }
    }
}
