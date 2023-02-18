public class Sedemciferne {
    public static int najvacsie7() {
        //1. číslo
        for (int a = 9; a >= 1; a--) {
            // 2. číslo
            for (int b = 9; b >= 1; b--) {
                // check rovnakého čísla
                if (b == a) continue;
                // 3. číslo
                for (int c = 9; c >= 1; c--) {
                    //check rovnakého čísla
                    if (c == a || c == b) continue;
                    // 4. číslo
                    for (int d = 9; d >= 1; d--) {
                        // check rovnakého čísla
                        if (d == a || d == b || d == c) continue;
                        // 5. číslo
                        for (int e = 9; e >= 1; e--) {
                            // check rovnakého čísla
                            if (e == a || e == b || e == c || e == d) continue;
                            // 6. číslo
                            for (int f = 9; f >= 1; f--) {
                                // check rovnakého čísla
                                if (f == a || f == b || f == c || f == d || f == e) continue;
                                // 7. číslo
                                for (int g = 9; g >= 1; g--) {
                                    // check rovnakého čísla
                                    if (g == a || g == b || g == c || g == d || g == e || g == f) continue;
                                    // číslo do kopy
                                    int x = a*1000000 + b*100000 + c*10000 + d*1000 + e*100 + f*10 + g;
                                    // najväčšie číslo
                                    if (x % a == 0 && x % b == 0 && x % c == 0 && x % d == 0 && x % e == 0 && x % f == 0 && x % g == 0) {
                                        return x;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        // ak ziadne cislo nevyhovuje podmienkam, vrat -1
        return -1;
    }
 
 
}