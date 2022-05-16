package base.days6;

public class TestArray12 {
    public static void main(String[] args) {
        method01(10);
        method01();
        method01(20,30,40);
        method01(30,40,50,60,70);
        method01(new int[]{11,22,33,44});

    }
    public static void method01(int ...num){
        System.out.println("=================1");
        for(int i:num){
            System.out.print(i+"\t");
        }
        System.out.println();
//        System.out.println(num2);
    }
}
