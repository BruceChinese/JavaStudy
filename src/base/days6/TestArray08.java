package base.days6;

import java.util.Arrays;

public class TestArray08 {
    public static void main(String[] args) {
        int arr[] = {12,34,56,7,3,10};
        System.out.println("删除元素前的数组:"+Arrays.toString(arr));

        int index = 0;
        for(int i=index;i<=arr.length-2;i++){
            arr[i]=arr[i+1];
        }
        arr[arr.length-1]=0;


        System.out.println("删除元素前的数组:"+Arrays.toString(arr));
    }
}
