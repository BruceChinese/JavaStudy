package base.days6;

public class TestArray04 {
    public static void main(String[] args) {
        int arr[] = {12,3,7,4,8,125,9,45};
        int num = getMaxNum(arr);
        System.out.println(num);
        System.out.println(num);
    }

    public static int getMaxNum(int[] arr){
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }
}
