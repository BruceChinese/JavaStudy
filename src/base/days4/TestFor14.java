package base.days4;

public class TestFor14 {
    public static void main(String[] args) {
        int size  = 50;
        int startNum=size/2+1;
        int endNum=size/2+1;
        boolean flag = true;
        for (int j = 1; j <= size; j++) {
            for (int i = 1; i <= size; i++) {
                if(i>=startNum&&i<=endNum){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
            if(endNum==size){
                flag = false;
            }
            if(flag) {
                startNum--;
                endNum++;
            }else{
                startNum++;
                endNum--;
            }
        }
    }
}
