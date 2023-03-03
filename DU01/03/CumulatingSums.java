import java.util.Arrays;

public class CumulatingSums {
    
    // vráti počet núl v stringovom zápise čísla retazec, ktoré prebehlo steps iteráciami vnútorného sčítania
    public static long pocetNul(String retazec, int steps) {
        String temp=retazec;
        int count = 0;
        for(int i = 0; i < temp.length(); i++)
            if(temp.charAt(i) == '0')
                count++;
        for(int i = 0; i < steps; i++)
        {
            String buff = "";
            for(int j = 0; j < temp.length();j++)
            {
                if(buff.length()>=1) {
                    int n = Character.getNumericValue(buff.charAt(buff.length()-1))+Character.getNumericValue(temp.charAt(j));
                    if (Integer.toString(n).contains("0"))
                        count++;
                    buff += Integer.toString(n);
                }
                buff += temp.charAt(j);
            }
            temp = buff;
        }

        return count;
    }
    //vráti pole počtu číslic v stringovom zápise čísla retazec, ktoré prebehlo steps iteráciami vnútorného sčítania. Číslice, ktorých počty máte zisťovať, sú v poli cisla (vo výslednom poli vráťte počty číslic v poradí ako vo vstupnom poli)
    public static long[] pocet(String retazec, int steps, int[] cisla) {
        int n = cisla.length;
        long [] result = new long[n];
        for(int i = 0; i < n; i++)
            result[i] = 0;
        String temp = retazec;
        for(int i = 0; i < temp.length(); i++)
            for(int j = 0; j < n; j++)
                if(Character.getNumericValue(temp.charAt(i)) == cisla[j])
                    result[j]++;
        for(int i = 0; i < steps; i++)
        {
            String buff = "";
            for(int j = 0; j < temp.length();j++)
            {
                if(buff.length()>=1) {
                    int k = Character.getNumericValue(buff.charAt(buff.length()-1))+Character.getNumericValue(temp.charAt(j));
                    for(int index = 0; index < n; index++) {
                        int count = Integer.toString(k).length()-Integer.toString(k).replace(Integer.toString(cisla[index]),"").length();
                        result[index]+=count;
                    }
                    buff += Integer.toString(k);
                }
                buff += temp.charAt(j);
            }
            temp = buff;
        }

        return result;

    }
    public static void main(String[] args) {
        System.out.println(pocetNul("468237", 0));
        System.out.println(pocetNul("50505510", 1));
        System.out.println(pocetNul("468237", 3));
        System.out.println(Arrays.toString(pocet("7777", 2, new int[]{1, 4, 5, 7})));
        System.out.println(Arrays.toString(pocet("31461151", 4, new int[]{2, 4})));
    }
}
