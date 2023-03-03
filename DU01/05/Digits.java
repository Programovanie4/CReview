
public class Digits {

    public static int calculate(int k, int b) {
        if (k > 9) {
            return -1;
        }
        int[] pole = new int[k];
        int digitSum = 0;
        for (int i = 1; i <= k; i++) {
            pole[i-1] = i;
            digitSum += i;
            if (digitSum > 9) {
                digitSum -= 9;
            }
        }
        if (digitSum == b) {
            int number = 0;
            for (int num : pole) {
                number = number*10 + num;
            }
            return number;
        }
        int numberNeeded = 0;
        if (digitSum > b) {
            numberNeeded = 9 - digitSum + b;
        } else {
            numberNeeded = b - digitSum;
        }
        for (int i = pole.length-1; i >= 0; i--) {
            int add = pole[i] + numberNeeded;
            if (add > 9-pole.length+1+i) {
                pole[i] = 9-pole.length+1+i;
                numberNeeded = add-9+pole.length-1-i;
            } else {
                pole[i] = add;
                numberNeeded = 0;
                break;
            }
        }
        if (numberNeeded != 0) {
            return -1;
        }
        int number = 0;
        for (int num : pole) {
            number = number*10 + num;
        }
        return number;
    }

    public static void main(String[] args) {
        System.out.println(calculate(1, 9));
        System.out.println(calculate(2, 5));
        System.out.println(calculate(3, 5));
        System.out.println(calculate(4, 3));
        System.out.println(calculate(9, 8));
    }
}
