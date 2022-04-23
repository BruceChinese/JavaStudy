package base.days2;
public class TestVar06 {
    public static void main(String[] args) {
        double num1 = 31.5;
        double num2 = 314E-2;
        System.out.println(num1);
        System.out.println(num2);

        // 浮点类型的变量：
        // 注意：浮点型默认时double类型的，要想将一个double类型的数赋值给float类型，必须加上f或者F
        float f1 = 3.11231231234f;
        System.out.println(f1);

        double d1 = 123123.123123123123d;
        System.out.println(d1);

        // 注意：最好不要进行浮点类型的比较
        float f2 = 0.3f;
        double d2 = 0.3;
        System.out.println(f2 == d2);

    }
}

