import java.util.Arrays;

public class Voltage {
    public static int pocetResetov(String napatia, int kroky){
        char[] pole = napatia.toCharArray();
        int a = napatia.indexOf(';');
        int l = napatia.length();
        int b = (l-(l%a))/a;
        int[][] array = new int[b][a];
        int f = 0;
        int s = 0;
        for (int i = 0; i < pole.length; i++){
            if(pole[i] == ';'){
                f++;
                s = 0;
            }
            else{
                array[f][s] = Character.getNumericValue(pole[i]);
                s++;
            }
        }
        int count = 0;
        for (int j = 0; j < kroky; j++){
            String zero = "";
            while(true) {
                int end = 0;
                String now = "";
                for (int x = 0; x < b; x++) {
                    for (int y = 0; y < a; y++) {
                        if (array[x][y] == 9) {
                            end++;
                            if (x > 0) {
                                if (y > 0) {
                                    now = Integer.toString(x-1) + Integer.toString(y-1);
                                    if (array[x - 1][y - 1] != 9 && zero.contains(now) == false) {
                                        array[x - 1][y - 1]++;
                                    }
                                }
                                now = Integer.toString(x-1) + Integer.toString(y);
                                if (array[x - 1][y] != 9 && zero.contains(now) == false) {
                                    array[x - 1][y]++;
                                }
                                if (y < a-1) {
                                    now = Integer.toString(x-1) + Integer.toString(y+1);
                                    if (array[x - 1][y + 1] != 9 && zero.contains(now) == false) {
                                        array[x - 1][y + 1]++;
                                    }
                                }
                            }
                            if (y > 0) {
                                now = Integer.toString(x) + Integer.toString(y-1);
                                if (array[x][y - 1] != 9 && zero.contains(now) == false) {
                                    array[x][y - 1]++;
                                }
                            }
                            if (y < a-1) {
                                now = Integer.toString(x) + Integer.toString(y+1);
                                if (array[x][y + 1] != 9 && zero.contains(now) == false) {
                                    array[x][y + 1]++;
                                }
                            }
                            if (x < b-1) {
                                if (y > 0) {
                                    now = Integer.toString(x+1) + Integer.toString(y-1);
                                    if (array[x + 1][y - 1] != 9 && zero.contains(now) == false) {
                                        array[x + 1][y - 1]++;
                                    }
                                }
                                now = Integer.toString(x+1) + Integer.toString(y);
                                if (array[x + 1][y] != 9 && zero.contains(now) == false) {
                                    array[x + 1][y]++;
                                }
                                if (y < a-1) {
                                    now = Integer.toString(x+1) + Integer.toString(y+1);
                                    if (array[x + 1][y + 1] != 9 && zero.contains(now) == false) {
                                        array[x + 1][y + 1]++;
                                    }
                                }
                            }
                            array[x][y] = 0;
                            count++;
                            zero += Integer.toString(x) + Integer.toString(y) + ";";
                        }
                    }
                }
                if (end == 0){
                    for (int x = 0; x < b; x++) {
                        for (int y = 0; y < a; y++) {
                            now = Integer.toString(x) + Integer.toString(y);
                            if (zero.contains(now) == false) {
                                array[x][y]++;
                            }
                        }
                    }
                    break;
                }
            }
        }
        return count; }

    public static int uplnyReset(String napatia){
        char[] pole = napatia.toCharArray();
        int a = napatia.indexOf(';');
        int l = napatia.length();
        int b = (l-(l%a))/a;
        int[][] array = new int[b][a];
        int f = 0;
        int s = 0;
        for (int i = 0; i < pole.length; i++){
            if(pole[i] == ';'){
                f++;
                s = 0;
            }
            else{
                array[f][s] = Character.getNumericValue(pole[i]);
                s++;
            }
        }
        for (int j = 0; j < Integer.MAX_VALUE; j++){
            String zero = "";
            while(true) {
                int end = 0;
                String now = "";
                int countZero = 0;
                for (int x = 0; x < b; x++) {
                    for (int y = 0; y < a; y++) {
                        if (array[x][y] == 0){
                            countZero++;
                        }
                        if (countZero == a*b){
                            return j+1;
                        }
                        if (array[x][y] == 9) {
                            end++;
                            if (x > 0) {
                                if (y > 0) {
                                    now = Integer.toString(x-1) + Integer.toString(y-1);
                                    if (array[x - 1][y - 1] != 9 && zero.contains(now) == false) {
                                        array[x - 1][y - 1]++;
                                    }
                                }
                                now = Integer.toString(x-1) + Integer.toString(y);
                                if (array[x - 1][y] != 9 && zero.contains(now) == false) {
                                    array[x - 1][y]++;
                                }
                                if (y < a-1) {
                                    now = Integer.toString(x-1) + Integer.toString(y+1);
                                    if (array[x - 1][y + 1] != 9 && zero.contains(now) == false) {
                                        array[x - 1][y + 1]++;
                                    }
                                }
                            }
                            if (y > 0) {
                                now = Integer.toString(x) + Integer.toString(y-1);
                                if (array[x][y - 1] != 9 && zero.contains(now) == false) {
                                    array[x][y - 1]++;
                                }
                            }
                            if (y < a-1) {
                                now = Integer.toString(x) + Integer.toString(y+1);
                                if (array[x][y + 1] != 9 && zero.contains(now) == false) {
                                    array[x][y + 1]++;
                                }
                            }
                            if (x < b-1) {
                                if (y > 0) {
                                    now = Integer.toString(x+1) + Integer.toString(y-1);
                                    if (array[x + 1][y - 1] != 9 && zero.contains(now) == false) {
                                        array[x + 1][y - 1]++;
                                    }
                                }
                                now = Integer.toString(x+1) + Integer.toString(y);
                                if (array[x + 1][y] != 9 && zero.contains(now) == false) {
                                    array[x + 1][y]++;
                                }
                                if (y < a-1) {
                                    now = Integer.toString(x+1) + Integer.toString(y+1);
                                    if (array[x + 1][y + 1] != 9 && zero.contains(now) == false) {
                                        array[x + 1][y + 1]++;
                                    }
                                }
                            }
                            array[x][y] = 0;
                            zero += Integer.toString(x) + Integer.toString(y) + ";";
                        }
                    }
                }
                if (end == 0){
                    for (int x = 0; x < b; x++) {
                        for (int y = 0; y < a; y++) {
                            now = Integer.toString(x) + Integer.toString(y);
                            if (zero.contains(now) == false) {
                                array[x][y]++;
                            }
                        }
                    }
                    break;
                }
            }
        }
        return -1; }

    public static void main(String[] args) {
        String input = "1234;5678;9012;3456";
        System.out.println(pocetResetov(input, 55)); //75
        System.out.println(pocetResetov(input, 30)); //75
        System.out.println(uplnyReset(input)); //55
        System.out.println(pocetResetov("111;191", 8));
    }
}
