package base.days4;

public class TestFor04 {
    public static void main(String[] args) {
        outer:
        for (int i = 0; i < 101; i++) {
            System.out.println(i);
            while (i==36){
                break outer;
            }
        }
    }
}
