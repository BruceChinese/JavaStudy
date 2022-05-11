package base.days4;

public class TestFor06 {
    public static void main(String[] args) {
  /*      for (int i = 1; i < 101; i++) {
            if(i==36){
                continue;
            }
            System.out.println(i);
        }*/
        outter:
        for (int i = 0; i < 101; i++) {
            while (i==36){
                System.out.println("===========");
                continue outter;
            }
            System.out.println(i);
        }
    }
}
