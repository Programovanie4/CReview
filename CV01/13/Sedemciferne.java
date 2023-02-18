public class Sedemciferne {
  public static int najvacsie7() {
      int i = 9876537;
      while (i > 1023456) {
          String x = String.valueOf(i);
          char[] ch = x.toCharArray();
          int nul = 0;
          int jed = 0;
          int dva = 0;
          int tri = 0;
          int sty = 0;
          int pat = 0;
          int ses = 0;
          int sed = 0;
          int ose = 0;
          int dev = 0;
          int rozdiel = 0;
          int delitelnost = 0;
          for (int j = 0; j < 7; j++) {
              if (ch[j] == '0') {
                  nul++;
                  if (nul > 0) {
                      rozdiel = 99;
                  }
              }
              if (ch[j] == '1') {
                  jed++;
                  if (jed > 1) {
                      rozdiel = 99;
                  }
                  delitelnost++;
              }
              if (ch[j] == '2') {
                  dva++;
                  if (dva > 1) {
                      rozdiel = 99;
                  }
                  if (i % 2 == 0){delitelnost++;}
              }
              if (ch[j] == '3') {
                  tri++;
                  if (tri > 1) {
                      rozdiel = 99;
                  }
                  if (i % 3 == 0){delitelnost++;}
              }
              if (ch[j] == '4') {
                  sty++;
                  if (sty > 1) {
                      rozdiel = 99;
                  }
                  if (i % 4 == 0){delitelnost++;}
              }
              if (ch[j] == '5') {
                  pat++;
                  if (pat > 1) {
                      rozdiel = 99;
                  }
                  if (i % 5 == 0){delitelnost++;}
              }
              if (ch[j] == '6') {
                  ses++;
                  if (ses > 1) {
                      rozdiel = 99;
                  }
                  if (i % 6 == 0){delitelnost++;}
              }
              if (ch[j] == '7') {
                  sed++;
                  if (sed > 1) {
                      rozdiel = 99;
                  }
                  if (i % 7 == 0){delitelnost++;}
              }
              if (ch[j] == '8') {
                  ose++;
                  if (ose > 1) {
                      rozdiel = 99;
                  }
                  if (i % 8 == 0){delitelnost++;}
              }
              if (ch[j] == '9') {
                  dev++;
                  if (dev > 1) {
                      rozdiel = 99;
                  }
                  if (i % 9 == 0){delitelnost++;}
              }
          }
          if (rozdiel == 0) {
              if (delitelnost == 7) {
                      return (i);
                  }
          }
          i -= 9;
      }
      return -1;
  }
 
  public static void main(String[] args) {
      System.out.println(najvacsie7());
  }
}