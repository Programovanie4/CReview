public class Sedemciferne {
    public static boolean check(int[] arr, int toCheckValue) {
        for (int element : arr) {
            if (element == toCheckValue) {
                return true;
            }
        }
        return false;
    }
  public static int najvacsie7() {
      for(int i = 9; i > 0; i --){
          for(int j = 9; j > 0; j --){
                if(i != j){
                    for(int k = 9; k > 0; k --){
                        if(i != k && j !=k){
                            for(int l = 9; l > 0; l --){
                                if(i != l && j !=l & k != l){
                                    for(int m = 9; m > 0; m --){
                                        if(i != m && j !=m & k != m & l != m){
                                            for(int n = 9; n > 0; n --){
                                                if(i != n && j !=n & k != n & l != n & m != n){
                                                    for(int o = 9; o > 0; o --) {
                                                        if (i != o && j != o & k != o & l != o & m != o & n != o) {
                                                            int cif_sucet = i+j+k+l+m+n+o;
                                                            int dvojcislie = o+ 10*n;
                                                            int trojcislie = dvojcislie + 100*m;
                                                            int cislo = trojcislie + 1000*l + 10000*k + 100000*j + 1000000*i;
 
                                                            int[] array = {i, j, k, l, m, n, o};
                                                            if(check(array, (7) ) & cislo%7!= 0){
                                                                continue;
                                                            }
                                                            if(check(array, 2) & cislo%2 != 0){
                                                                continue;
                                                            }
                                                            if(check(array, 3) & cislo%3 !=0){
                                                                continue;
                                                            }
                                                            if(check(array, 4) & cislo%4!=0){
                                                                continue;
                                                            }
                                                            if(check(array, 5) & cislo%5 != 0){
                                                                continue;
                                                            }
                                                            if(check(array, 6) & cislo%6 != 0){
                                                                continue;
                                                            }
                                                            if(check(array, 8) & cislo%8 != 0){
                                                                continue;
                                                            }
                                                            if(check(array, 9) & cislo%9 != 0){
                                                                continue;
                                                            }
                                                            return cislo;
 
 
                                                        }
                                                    }
 
                                                }
                                            }
 
                                        }
                                    }
 
                                }
                            }
                        }
                    }
                }
          }
      }
      return -1;
  }
 
  public static void main(String[] args) {
      System.out.println(najvacsie7());
  }
}