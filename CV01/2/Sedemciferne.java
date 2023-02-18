public class Sedemciferne {
  public static int najvacsie7() {
      for(int a=9;a>0;a--){
          for(int b=9;b>0;b--){
              if(b==a) continue;
              for(int c=9;c>0;c--){
                  if(c==b || c==a) continue;
                  for(int d=9;d>0;d--){
                      if(d==c || d==b || d==a) continue;
                      for(int e=9;e>0;e--){
                          if(e==d || e==c || e==b || e==a) continue;
                          for(int f=9;f>0;f--){
                              if(f==e || f==d || f==c || f==b || f==a) continue;
                              for(int g=9;g>0;g--){
                                  if(g==f || g==e || g==d || g==c || g==b || g==a) continue;
                                  if(a==2 || b==2 || c==2 || d==2 || e==2 || f==2 || g==2){
                                      if(g%2!=0) continue;
                                  }
                                  if(a==3 || b==3 || c==3 || d==3 || e==3 || f==3 || g==3){
                                      if((a+b+c+d+e+f+g)%3!=0) continue;
                                  }
                                  if(a==4 || b==4 || c==4 || d==4 || e==4 || f==4 || g==4){
                                      if((f*10+g)%4!=0) continue;
                                  }
                                  if(a==5 || b==5 || c==5 || d==5 || e==5 || f==5 || g==5){
                                      if(g%5!=0) continue;
                                  }
                                  if(a==6 || b==6 || c==6 || d==6 || e==6 || f==6 || g==6){
                                      if(g%2!=0 || (a+b+c+d+e+f+g)%3!=0) continue;
                                  }
                                  if(a==7 || b==7 || c==7 || d==7 || e==7 || f==7 || g==7){
                                      if((a*1000000+b*100000+c*10000+d*1000+e*100+f*10+g)%7!=0) continue;
                                  }
                                  if(a==8 || b==8 || c==8 || d==8 || e==8 || f==8 || g==8){
                                      if((e*100+f*10+g)%8!=0) continue;
                                  }
                                  if(a==9 || b==9 || c==9 || d==9 || e==9 || f==9 || g==9){
                                      if((a+b+c+d+e+f+g)%9!=0) continue;
                                  }
                                  return a*1000000+b*100000+c*10000+d*1000+e*100+f*10+g;
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