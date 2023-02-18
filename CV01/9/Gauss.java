import java.math.BigInteger;
 
public class Gauss {
    public static long sucet(int a, int b) {
        BigInteger one = BigInteger.valueOf(1), two = BigInteger.valueOf(2);
        BigInteger aa = BigInteger.valueOf(a), bb = BigInteger.valueOf(b);
        BigInteger n = bb.subtract(aa).add(one);                                                    // n = b - a + 1
        return n.multiply(n.add(one)).divide(two).add(n.multiply(aa.subtract(one))).longValue();    // n(n + 1) / 2 + n * (a - 1)
    }
 
    public static long sucet(int a, int b, int delta) {
        BigInteger one = BigInteger.valueOf(1), two = BigInteger.valueOf(2);
        BigInteger aa = BigInteger.valueOf(a), bb = BigInteger.valueOf(b), d = BigInteger.valueOf(delta);
        BigInteger n = bb.subtract(aa).divide(d).add(one);                          // n = (b - a) / delta + 1
        BigInteger x = n.subtract(one).multiply(n).divide(two).multiply(d);         // x = (n - 1)n / 2 * delta
        return n.multiply(aa).add(x).longValue();                                   // n * a + x
    }
 
    public static void main(String[] args) {
        System.out.println(sucet(1, 100));
        System.out.println(sucet(1, 100000));
 
        System.out.println(sucet(1, 100000, 8));
        System.out.println(sucet(1, 2147483626, 14));
    }
}