package base.days6;


public class TestArray02 {
    public static void main(String[] args) {
        /*
        数组的作用： 用来存储相同类型的数据
        以int类型数据为案例：数组用来存储int类型数据
         */
        // 1、声明(定义数组)
        int[] arr;
        int arr2[];
        int[] arr3 = null;

        // 2、创建
        arr = new int[4]; // 给数组开辟了一个长度为4的空间

        //3 、赋值
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        System.out.println(arr);
        System.out.println(arr.length);
    }
}
