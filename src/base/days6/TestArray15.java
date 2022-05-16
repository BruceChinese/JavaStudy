package base.days6;

public class TestArray15 {
    public static void main(String[] args) {
        int[][] arr = new int[3][];

        int[] a1={1,2,3};
        arr[0] = a1;
        arr[1]=new int[]{4,5,6,7};
        arr[2] = new int[]{9,10};

        System.out.println(arr[1][2]);

//        for(int i=0;i<=2;i++){
//            for(int j=0;j<=arr[i].length;j++){
//                System.out.print(arr[i][j]+"\t");
//            }
//            System.out.println();
//        }

//        for (int i = 0; i < arr.length; i++) {
//            for(int num:arr[i]){
//                System.out.print(num+"\t");
//            }
//            System.out.println();
//        }

        for(int[] a:arr){
            for(int num:a){
                System.out.print(num+"\t");
            }
            System.out.println();
        }
    }
}
