public class Sedemciferne {
    public static int najvacsie7() {
        int najvacsie = 0;
        for (int i = 1000000; i < 10000000; i++) {
            boolean flag = false;
            int[] mynum = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
            int pp = 1;
            for (int j = 0; j < 7; j++) {
                if (((i / pp) % 10) == 0) {
                    flag = true;
                    break;
                }
                mynum[((i / pp) % 10)]++;
                if (mynum[((i / pp) % 10)] > 1) flag = true;
                if (i % ((i / pp) % 10) != 0) flag = true;
                pp *= 10;
            }
            if (!flag) {
                najvacsie = i;
            }
        }
        return najvacsie;
    }
 
    public static void main(String[] args) {
        System.out.println(najvacsie7());
    }
}