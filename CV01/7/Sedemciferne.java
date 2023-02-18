//riešenie od chat gpt pokus3 s jasnejšími inštrukciami

import java.util.Arrays;

public class Sedemciferne {

    public static int najvacsie7() {
        int out = -1;

other

        for (int a = 9; a >= 1; a--) {
            for (int b = 9; b >= 1; b--) {
                if (b == a) continue;
                for (int c = 9; c >= 1; c--) {
                    if (c == a || c == b) continue;
                    for (int d = 9; d >= 1; d--) {
                        if (d == a || d == b || d == c) continue;
                        for (int e = 9; e >= 1; e--) {
                            if (e == a || e == b || e == c || e == d) continue;
                            for (int f = 9; f >= 1; f--) {
                                if (f == a || f == b || f == c || f == d || f == e) continue;
                                for (int g = 9; g >= 1; g--) {
                                    if (g == a || g == b || g == c || g == d || g == e || g == f) continue;
                                    int num = a * 1000000 + b * 100000 + c * 10000 + d * 1000 + e * 100 + f * 10 + g;
                                    if (num % a == 0 && num % b == 0 && num % c == 0 && num % d == 0 && num % e == 0 && num % f == 0 && num % g == 0) {
                                        out = num;
                                        break;
                                    }
                                }
                                if (out > 0) break;
                            }
                            if (out > 0) break;
                        }
                        if (out > 0) break;
                    }
                    if (out > 0) break;
                }
                if (out > 0) break;
            }
            if (out > 0) break;
        }

        return out;
    }


    public static void main(String[] args) {
        int result = najvacsie7();
        System.out.println(result);
    }
}