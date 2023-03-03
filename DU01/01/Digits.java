
public class Digits {

    public static int calculate(int k, int b) {
        if (k == 1){
            return b;
        }
        if (k > 9 || (k == 9 && b != 9)){
            return -1;
        }
        if (k == 9){
            return 123456789;
        }
        for (int i = 1;i <= 9; i++){
            String num = String.valueOf(i);
            if (k > 1){

                for (int j = 2;j <= 9; j++){
                    String num2 = num + j;

                    if (k > 2){
                        for (int l = 3;l <= 9; l++){
                            String num3 = num2 + l;

                            if (k > 3){
                                for (int m = 4;m <= 9; m++){
                                    String num4 = num3 + m;

                                    if (k > 4){
                                        for (int n = 5;n <= 9; n++){
                                            String num5 = num4 + n;

                                            if (k > 5){
                                                for (int o = 6;o <= 9; o++){
                                                    String num6 = num5 + o;

                                                    if (k > 6){
                                                        for (int p = 7;p <= 9; p++){
                                                            String num7 = num6 + p;

                                                            if (k > 7){
                                                                for (int q = 8;q <= 9; q++){
                                                                    String num8 = num7 + q;

                                                                    if (calc(num8) == b){
                                                                        return Integer.parseInt(num8);
                                                                    }
                                                                }
                                                            }

                                                            else if (calc(num7) == b && uniq(num7)){
                                                                return Integer.parseInt(num7);
                                                            }
                                                        }
                                                    }

                                                    else if (calc(num6) == b && uniq(num6)){
                                                        return Integer.parseInt(num6);
                                                    }
                                                }
                                            }

                                            else if (calc(num5) == b && uniq(num5)){
                                                return Integer.parseInt(num5);
                                            }
                                        }
                                    }

                                    else if (calc(num4) == b && uniq(num4)){
                                        return Integer.parseInt(num4);
                                    }
                                }
                            }

                            else if (calc(num3) == b && uniq(num3)){
                                return Integer.parseInt(num3);
                            }
                        }
                    }

                    else if (calc(num2) == b && uniq(num2)){
                        return Integer.parseInt(num2);
                    }
                }
            }
            else if (calc(num) == b ){
                return Integer.parseInt(num);
            }
        }


        return -1;
    }

    public static int calc(String num){
        while (Integer.parseInt(num) / 10 >= 1){
            int number = 0;
            for (int i = 0; i < num.length(); i++){
                number += Character.getNumericValue(num.charAt(i));
            }
            num = String.valueOf(number);
        }
        return Integer.parseInt(num);
    }

    public static boolean uniq(String num){
        for (int i = 0; i < num.length(); i++){
            if (num.lastIndexOf(num.charAt(i)) != i){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(calculate(1, 9));
        System.out.println(calculate(2, 5));
        System.out.println(calculate(3, 5));
        System.out.println(calculate(4, 3));
        System.out.println(calculate(7, 6));
    }
}
