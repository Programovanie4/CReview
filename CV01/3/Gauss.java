import java.math.BigInteger;
 
public class Gauss {
 
    public static long sucet(int a, int b)  {
        BigInteger num2 = BigInteger.valueOf(a);
        BigInteger num1 = BigInteger.valueOf(b);
        BigInteger newFrom = num2.multiply(num2.add(BigInteger.ONE.negate())).divide(BigInteger.TWO).negate();
        BigInteger newTo = num1.multiply(num1.add(BigInteger.ONE)).divide(BigInteger.TWO);
        BigInteger sum = newTo.add(newFrom);
        return sum.longValue();
    }
 
    public static long sucet(int a, int b, int delta)  {
        BigInteger num2 = BigInteger.valueOf(b);
        BigInteger num1 = BigInteger.valueOf(a);
        BigInteger delta1 = BigInteger.valueOf(delta);
        BigInteger n = num2.add(num1.negate()).divide(delta1).add(BigInteger.ONE);
        BigInteger helpSum = n.add(BigInteger.ONE.negate()).multiply(delta1);
        BigInteger sum = BigInteger.TWO.multiply(num1).add(helpSum).multiply(n).divide(BigInteger.TWO);
        return sum.longValue();
    }
}