package base.days6;

import java.util.Arrays;

public class TestArray14 {
    public static void main(String[] args) {
        int srcArr[] = {11,22,33,44,55,66,77,88};
        int destArr[] = new int[10];

        System.arraycopy(srcArr,1,destArr,3,3);
        System.out.println(Arrays.toString(destArr));
    }
}
