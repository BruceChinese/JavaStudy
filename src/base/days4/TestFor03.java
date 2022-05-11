package base.days4;

public class TestFor03 {
    public static void main(String[] args) {
        // break 的作用： 停止最近的循环
/*        for (int i = 0; i < 101; i++) {
            System.out.println(i);
            if(i==36){
                break;
            }
        }*/
        for (int i = 0; i < 101; i++) {
            System.out.println(i);
            while (i==36){
                break; // 1-100  break 停止的是while循环，而不是外面的for循环
            }
        }
    }
}
