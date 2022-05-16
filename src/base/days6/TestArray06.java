package base.days6;

public class TestArray06 {
    public static void main(String[] args) {
        int arr[] = {12,34,56,7,3,10};
        int index = getIndex(arr,56);
        if(index !=-1){
            System.out.println(index);
        }else{
            System.out.println("查无此数");
        }
    }

    public static int getIndex(int[] arr, int ele){
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==ele){
                index = i;
                break;
            }
        }
        return index;
    }
}
