package base.days3;

public class TestOps10 {
    public static void main(String[] args) {
        int i = 8;
        System.out.println((5>7)&&(i++==2));
        System.out.println(i);

        int a = 8;
        System.out.println((5>7)&(a++==2));
        System.out.println(a);

        int m =8;
        System.out.println((5<7)&&(m++==2));
        System.out.println(m);

        int b = 2;
        System.out.println((5<7)&(b++==2));
        System.out.println(b);

        int c = 2;
        System.out.println((5<7)&(++c==2));
        System.out.println(c);
    }
}
