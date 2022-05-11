package base.days4;

public class TestWhile02 {
    public static void main(String[] args) {
//    int i  = 1;
//    int sum = 0;
//    while (i<=100){
//        sum += i;
//        i++;
//    }
//        System.out.println(sum);
//    }

/*        int  i = 1;
        int sum = 0;
        while ( i<=100){
            sum += i;
            i = i+2;
        }
        System.out.println(sum);*/



//        int i = 5;
//        int sum = 0;
//        while (i<=100){
//            sum +=i;
//            i=i+5;
//        }
//        System.out.println(sum);
    int i = 1;
    long sum = 1L;
    while  (i<=100){
        sum *=(long)i;
        i = i +2;
    }

        System.out.println(sum);
    }

}
