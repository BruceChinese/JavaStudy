package base.days4;

public class TestFor16 {
    public static void main(String[] args) {
        /*for(int x = 1;x<=100;x++){
            for (int y = 1; y <= 100; y++) {
                for (int z = 1; z <= 100; z++) {
                    if((x+y+z ==100)&&(5*x+3*y+z/3==100)&&(z%3==0)){
                        System.out.println(x+"======="+y+"======="+z);
                    }
                }
            }
        }*/
        // 优化
                for(int x = 1;x<=19;x++){
            for (int y = 1; y <= 31; y++) {
                int z = 100-x-y;
                    if((5*x+3*y+z/3==100)&&(z%3==0)){
                        System.out.println(x+"======="+y+"======="+z);
                    }
                }
            }
        }
}
