public class Sedemciferne {
  public static int najvacsie7() {
      for (int i = 10000000; i > 1000000; i--){
          if (i%2 == 0){
              if (i%3 == 0){
                  if (i%7 == 0){
                      if (i%8 == 0){
                          if (i%9 == 0){
                              if (differentDigits(i)){
                                return i;
                              }
                          }
                      }
                  }
              }
          }
      }
      return -1;
  }
    public static boolean differentDigits(int i){
        String s = String.valueOf(i);
        for (int j = 0; j < s.length(); j++){
            int counter = 0;
            for (int k = 0; k < s.length(); k++){
                if (s.charAt(j) == s.charAt(k)){
                    counter++;
                }
            }
            if (counter > 1){
                return false;
            }
        }
        return true;
    }
  public static void main(String[] args) {
      najvacsie7();
  }
}