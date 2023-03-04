import java.util.ArrayList;
import java.util.List;

public class Digits {

    public static int calculate(int k, int b) {
        if(k == 1){
            if(b>0 && b<=9){
                return b;
            }
        }
        if(k == 2){
            if(b>2 && b<=9){
                return 10+b-1;
            }
            if(b == 1){
                return 19;
            }
        }
        if(k == 3){
            if(b>5 && b<=9){
                return 120 + b-3;
            }
            if(b >= 1 && b <=3){
                return 126 + b;
            }
            if(b == 4){
                return 139;
            }
            if(b == 5){
                return 149;
            }
        }
        if(k == 4){
            if(b >=1 && b < 7){
                return 1233 + b;
            }
            if(b >= 7 && b <=9){
                return 1179 + 10*b;
            }
        }
        if(k == 5){
            if(b >= 6 && b<=9){
                return 12339+b;
            }
            if(b == 1){
                return 12349;
            }
            if(b >= 2 && b <= 5){
                return 12339 + 10*b;
            }
        }
        if(k == 6){
            if(b >=3 && b <= 6){
                return 123453 +b;
            }
            if(b >= 7 && b <= 9){
                return 123399 +10*b;
            }
            if(b == 1){
                return 123589;
            }
        }
        if(k == 7){
            if(b >= 1 && b <= 3){
                return 1234566 + b;
            }
            if(b >= 4 && b <= 5){
                return 1234569 + 10*(b-3);
            }
            if(b >= 6 && b <= 7){
                return 1234589 + 100*(b-5);
            }
            if(b >= 8 && b <= 9){
                return 1234789 + 1000*(b-7);
            }
        }
        if(k == 8){
            if(b == 9){
                return 12345678;
            }
            if(b == 1){
                return 12345679;
            }
            if(b == 2){
                return 12345689;
            }
            if(b == 3){
                return 12345789;
            }
            if(b == 4){
                return 12346789;
            }
            if(b == 5){
                return 12356789;
            }
            if(b == 6){
                return 12456789;
            }
            if(b == 7){
                return 13456789;
            }
            if(b == 8){
                return 23456789;
            }
        }
        if(k == 9){
            if(b == 9){
                return 123456789;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(calculate(1, 9));
        System.out.println(calculate(2, 5));
        System.out.println(calculate(3, 5));
        System.out.println(calculate(4, 3));
    }
}
