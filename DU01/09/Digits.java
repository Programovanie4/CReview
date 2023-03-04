public class Digits {
    public static int sum (int x){
        String a = String.valueOf(x);
        int total = 0;
        for (char i: a.toCharArray()){
            total += Integer.parseInt(String.valueOf(i));
        }
        if (total >= 10)
            return sum(total);
        return total;
    }
    public static int calculate(int k, int b) {
        if (k > 9)
            return -1;
        if (k == 1)
            return b;
        if (k == 9) {
            if (b != 9) {
                return -1;
            }
            return 123456789;
        }
        int[] digits = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int number = 0;
        for (int i: digits){
            if (i == 0)
                continue;
            number += i * Math.pow(10, 0);
            digits[i-1] = 0;
            for (int j: digits){
                if (j == 0 || k < 2)
                    continue;
                number += j * Math.pow(10, 1);
                digits[j-1] = 0;
                for (int l: digits){
                    if (l == 0 || k < 3)
                        continue;
                    number += l * Math.pow(10, 2);
                    digits[l-1] = 0;
                    for (int m: digits){
                        if (m == 0 || k < 4)
                            continue;
                        number += m * Math.pow(10, 3);
                        digits[m-1] = 0;
                        for (int n: digits){
                            if (n == 0  || k < 5)
                                continue;
                            number += n * Math.pow(10, 4);
                            digits[n-1] = 0;
                            for (int o: digits){
                                if (o == 0  || k < 6)
                                    continue;
                                number += o * Math.pow(10, 5);
                                digits[o-1] = 0;
                                for (int p: digits){
                                    if (p == 0  || k < 7)
                                        continue;
                                    number += p * Math.pow(10, 6);
                                    digits[p-1] = 0;
                                    for (int q: digits){
                                        if (q == 0  || k < 8)
                                            continue;
                                        number += q * Math.pow(10, 7);
                                        digits[q-1] = 0;
                                        for (int r: digits){
                                            if (r == 0)
                                                continue;
                                            number += r * Math.pow(10, 8);
                                            digits[r-1] = 0;
                                            if (k == 9 && sum(number) == b){
                                                StringBuilder a = new StringBuilder();
                                                String c = String.valueOf(number);
                                                a.append(c);
                                                a.reverse();
                                                number = Integer.parseInt(String.valueOf(a));
                                                return number;
                                            }
                                            number -= r * Math.pow(10, 8);
                                            digits[r-1] = r;
                                        }
                                        if (k == 8 && sum(number) == b){
                                            StringBuilder a = new StringBuilder();
                                            String c = String.valueOf(number);
                                            a.append(c);
                                            a.reverse();
                                            number = Integer.parseInt(String.valueOf(a));
                                            return number;
                                        }
                                        number -= q * Math.pow(10, 7);
                                        digits[q-1] = q;
                                    }
                                    if (k == 7 && sum(number) == b){
                                        StringBuilder a = new StringBuilder();
                                        String c = String.valueOf(number);
                                        a.append(c);
                                        a.reverse();
                                        number = Integer.parseInt(String.valueOf(a));
                                        return number;
                                    }
                                    number -= p * Math.pow(10, 6);
                                    digits[p-1] = p;
                                }
                                if (k == 6 && sum(number) == b){
                                    StringBuilder a = new StringBuilder();
                                    String c = String.valueOf(number);
                                    a.append(c);
                                    a.reverse();
                                    number = Integer.parseInt(String.valueOf(a));
                                    return number;
                                }
                                number -= o * Math.pow(10, 5);
                                digits[o-1] = o;
                            }
                            if (k == 5 && sum(number) == b){
                                StringBuilder a = new StringBuilder();
                                String c = String.valueOf(number);
                                a.append(c);
                                a.reverse();
                                number = Integer.parseInt(String.valueOf(a));
                                return number;
                            }
                            number -= n * Math.pow(10, 4);
                            digits[n-1] = n;
                        }
                        if (k == 4 && sum(number) == b){
                            StringBuilder a = new StringBuilder();
                            String c = String.valueOf(number);
                            a.append(c);
                            a.reverse();
                            number = Integer.parseInt(String.valueOf(a));
                            return number;
                        }
                        number -= m * Math.pow(10, 3);
                        digits[m-1] = m;
                    }
                    if (k == 3 && sum(number) == b){
                        StringBuilder a = new StringBuilder();
                        String c = String.valueOf(number);
                        a.append(c);
                        a.reverse();
                        number = Integer.parseInt(String.valueOf(a));
                        return number;
                    }
                    number -= l * Math.pow(10, 2);
                    digits[l-1] = l;
                }
                if (k == 2 && sum(number) == b){
                    StringBuilder a = new StringBuilder();
                    String c = String.valueOf(number);
                    a.append(c);
                    a.reverse();
                    number = Integer.parseInt(String.valueOf(a));
                    return number;
                }
                number -= j * Math.pow(10, 1);
                digits[j-1] = j;
            }
            if (k == 1 && sum(number) == b){
                StringBuilder a = new StringBuilder();
                String c = String.valueOf(number);
                a.append(c);
                a.reverse();
                number = Integer.parseInt(String.valueOf(a));
                return number;
            }
            number -= i * Math.pow(10, 0);
            digits[i-1] = i;
        }
        return -1;

    }

    public static void main(String[] args) {
        System.out.println(calculate(1, 9));
        System.out.println(calculate(2, 5));
        System.out.println(calculate(3, 5));
        System.out.println(calculate(4, 3));
        System.out.println(calculate(9, 1));
        System.out.println(calculate(8, 3));
        System.out.println(calculate(3, 10));
    }
}
