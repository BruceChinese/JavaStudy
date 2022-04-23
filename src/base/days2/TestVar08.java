package base.days2;

public class TestVar08 {
    public static void main(String[] args) {
        char ch1 ='A';
        System.out.println(ch1);
        System.out.println(ch1+90);
        System.out.println(155-ch1);
        // char 类型我们看到的样子字面常量是他本身的字面常量,但是底层在进行计算的时候，实际上是按照一定的码进行计算
        // 这个码就是ASCII
        // 之前说char类型是按照Unicode码表进行存储的(Uniconde兼容了ASCII码，Uniconde的前128位置ASCII)

        char ch2 = '中';
        System.out.println(ch2);
        System.out.println(ch2+90);
        System.out.println(20103-ch2);

        char ch6  = '2'+2;
        System.out.println(ch6);
    }
}

