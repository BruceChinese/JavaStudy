package base.days5;

import java.util.Scanner;

public class TestArray07 {
    public static void main(String[] args) {
        int arr[] = {12,34,56,7,3,10};
        System.out.println("增加元素前: ");
        for (int i = 0; i < arr.length; i++) {
            if(i!=arr.length-1){
                System.out.print(arr[i]+",");
            }else {
                System.out.println(arr[i]);
            }
        }
//        int index = 1;
//        for(int i=arr.length-1;i>=(index+1);i--){
//            arr[i] = arr[i-1];
//        }
//        arr[index]=666;
        Scanner sc = new Scanner(System.in);
        System.out.println("请录入你要添加元素的制定下标:");
        int index = sc.nextInt();
        System.out.println("请输入你要添加的元素: ");
        int ele = sc.nextInt();

insertEle(arr,1,888);
        System.out.println("增加元素后: ");
        for (int i = 0; i < arr.length; i++) {
            if(i!=arr.length-1){
                System.out.print(arr[i]+",");
            }else {
                System.out.println(arr[i]);
            }
        }
    }

    public static void insertEle(int[] arr,int index,int ele){
        for(int i=arr.length-1;i>=(index+1);i--){
            arr[i] = arr[i-1];
        }
        arr[index]=ele;
    }
}
