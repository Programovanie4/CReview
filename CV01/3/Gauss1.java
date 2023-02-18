import java.math.BigInteger;
 
public class Gauss {
 
    public static BigInteger getNumber(int number, String option) {
        if(option.equals("to")) {
            BigInteger large = new BigInteger(String.valueOf(number));
            BigInteger first_sum = large.multiply(large);
            first_sum = first_sum.add(large);
            BigInteger divide = new BigInteger("2");
            BigInteger first_sum2 = first_sum.divide(divide);
            return first_sum2;
        }
        else {
            BigInteger large = new BigInteger(String.valueOf(number));
            BigInteger first_sum = large.multiply(large);
            first_sum = first_sum.subtract(large);
            BigInteger divide = new BigInteger("2");
            BigInteger first_sum2 = first_sum.divide(divide);
            return first_sum2;
        }
 
    }
 
    public static long sucet(int a, int b)  {
        BigInteger getA = getNumber(a,"from");
        BigInteger getB = getNumber(b,"to");
        BigInteger sum = getB.subtract(getA);
        long result = sum.longValue();
        return result;
    }
 
    public static long sucet(int a, int b, int delta)  {
        if(delta == 1) {
            return sucet(a,b);
        }
        long counter = 1;
        int copy_of_new_num = a;
        while(copy_of_new_num + delta < b) {
            copy_of_new_num += delta;
            counter++;
        }
        BigInteger new_num = new BigInteger(String.valueOf(copy_of_new_num));
        BigInteger div = new BigInteger("2");
        BigInteger a_big = new BigInteger(String.valueOf(a));
        BigInteger sum = new_num.add(a_big);
        BigInteger counter_big = new BigInteger(String.valueOf(counter));
        sum = sum.multiply(counter_big);
        sum = sum.divide(div);
        long result = sum.longValue();
        return result;
    }
 
    public static void main(String[] args) {
        
    }
}
 