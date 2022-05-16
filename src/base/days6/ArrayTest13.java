package base.days6;

import java.util.Arrays;

public class ArrayTest13 {
    public static void main(String[] args) {
        int arr[] = {1,3,5,7,2,4,8};
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.binarySearch(arr,4));

        int arr2[] = {1,3,7,2,4,8};
        int[] newArray = Arrays.copyOf(arr2,4);
        System.out.println(Arrays.toString(newArray));

        int  newArr2[] = Arrays.copyOfRange(arr2,1,4);
        System.out.println(Arrays.toString(newArr2));

        int[] arr3 = {1,3,7,2,4,8};
        int[] arr4 = {1,3,7,2,4,8};
        System.out.println(Arrays.equals(arr3,arr4));
        System.out.println(arr3 == arr4);

        int[] arr5 = {1,3,7,24,6};
        Arrays.fill(arr5,10);
        System.out.println(Arrays.toString(arr5));
    }
}
