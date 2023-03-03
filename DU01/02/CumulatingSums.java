public class CumulatingSums {
    public static void main(String[] args){
//        System.out.println(pocetNul("468237", 0));
//        System.out.println(pocetNul("50505510", 1));
//        System.out.println(pocetNul("468237", 3));
//        pocet("7777", 2, new int[]{1, 4, 5, 7});

//        pocet("31461151", 4, new int[]{2, 4}) -> {9, 13});
//        pocet("31461151", 4, new int[]{2, 4});
    }
    public static long pocetNul(String retazec, int steps){
        int num = 0;
        int z1 = 0;
        int z2 = 0;
        StringBuffer new_ret = new StringBuffer();
        for (int i = 0; i < steps; i++){
            for (int j = 0; j < retazec.length()-1;j++){
                z1 = Integer.valueOf(retazec.charAt(j) - '0');
                z2 = Integer.valueOf(retazec.charAt(j+1) - '0');
                new_ret.append((retazec.charAt(j) - '0'));
                new_ret.append((z1 + z2));
            }
            new_ret.append(retazec.charAt(retazec.length()-1) - '0');
            retazec = new_ret.toString();
            new_ret.delete(0,new_ret.length());
        }
        int counter = 0;
        for (int k = 0; k < retazec.length();k++){
            if (retazec.charAt(k) == '0'){
                counter++;
            }
        }
        return counter;
    }
    public static long[] pocet(String retazec, int steps, int[] cisla){
        int dlzka = cisla.length;
        long a[] = new long[dlzka];
        int num = 0;
        int z1 = 0;
        int z2 = 0;
        StringBuffer new_ret = new StringBuffer();
        for (int i = 0; i < steps; i++){
            for (int j = 0; j < retazec.length()-1;j++){
                z1 = Integer.valueOf(retazec.charAt(j) - '0');
                z2 = Integer.valueOf(retazec.charAt(j+1) - '0');
                new_ret.append((retazec.charAt(j) - '0'));
                new_ret.append((z1 + z2));
            }
            new_ret.append(retazec.charAt(retazec.length()-1) - '0');
            retazec = new_ret.toString();
            new_ret.delete(0,new_ret.length());
        }
        int counter = 0;
        for (int j = 0; j < cisla.length; j++) {
            counter = 0;
            for (int k = 0; k < retazec.length(); k++) {
                if ((int) (retazec.charAt(k) - '0')  == cisla[j]) {
                    counter++;
                }
            }
            a[j] = counter;
        }
        return a;
    }
}
