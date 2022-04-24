package base.days3;

public class TestOpe09 {
    public static void main(String[] args) {
        // 逻辑与
        System.out.println(true & true);
        System.out.println(true & false);
        System.out.println(false & false);
        System.out.println(false & true);

        // 短路与： &&  效率高一些，只有第一个为false，那么第二个就不用计算了 就为false
        System.out.println("+==========================");
        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(false && false);
        System.out.println(false && true);

        // 逻辑或: |
        System.out.println("+==========================");
        System.out.println(true | true);
        System.out.println(true | false);
        System.out.println(false | false);
        System.out.println(false | true);
        // 逻辑或: ||  效率高一些，只要第一个表达式为true，第二个就不用计算了
        System.out.println("+==========================");
        System.out.println(true || true);
        System.out.println(true || false);
        System.out.println(false || false);
        System.out.println(false || true);

        // 逻辑非
        System.out.println("+==========================");
        System.out.println( !true);
        System.out.println( !false);
        // 逻辑异或 ^
        System.out.println("+==========================");
        System.out.println(true^true);
        System.out.println(false^true);
        System.out.println(true^false);
        System.out.println(false^false);


    }
}
