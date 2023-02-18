import java.math.BigInteger;
 
public class Zaujimave {
    public static int pocetZaujimavychInt(int n) {
        BigInteger one = BigInteger.valueOf(1), ten = BigInteger.valueOf(10);
        return BigInteger.valueOf(n).add(one).divide(ten).intValue();               // (n + 1) / 10
    }
 
    public static long pocetZaujimavychLong(long n) {
        BigInteger one = BigInteger.valueOf(1), ten = BigInteger.valueOf(10);
        return BigInteger.valueOf(n).add(one).divide(ten).longValue();              // (n + 1) / 10
    }
 
    public static long pocetBinarneZaujimavychLong(long n) {
        BigInteger one = BigInteger.valueOf(1), four = BigInteger.valueOf(4);
        return BigInteger.valueOf(n).add(one).divide(four).longValue();             // (n + 1) / 4
    }
 
    public static void main(String[] args) {
        System.out.println(pocetZaujimavychInt(109));
        System.out.println(pocetZaujimavychLong(309));
        System.out.println(pocetBinarneZaujimavychLong(54));
    }
}