package base.days4;

public class TestSwitch {
    public static void main(String[] args) {
        int score = 27;
        switch (score / 10){
            case 10:
                System.out.println("A");
                break;
            case 9:
                System.out.println("B");
                break;
            case 8:
                System.out.println("C");
                break;
            case 7:
                System.out.println("D");
                break;
            case 6:
            case 5:
            case 4:
            case 3:
            case 2:
            case 1:
            case 0:
                System.out.println("E");
                break;

            default:
                System.out.println("成绩错误");
        }
    }
}
