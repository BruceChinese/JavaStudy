package base.days3;

public class TestOpe04 {
    public static void main(String[] args) {
        int a = 5;
        a++; // 理解为: a=a+1
        System.out.println(a);
        a = 5;
        ++a;
        System.out.println(a);

        // 总结： ++单独使用功能的时候，无论放在前面还是后面都是加1的操作

        // 将++参与到运算中
        a = 5;
        int m = a++ + 7;  // 先运算 m=a+7  再加1  a=a+1
        System.out.println(m);
        System.out.println(a);

        a = 5;
        int n = ++a + 7;  // 先加1 a=a+1  在运算 n=a+1
        System.out.println(n);
        System.out.println(a);
    }
}
