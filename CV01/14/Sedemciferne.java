public class Sedemciferne {
  public static int najvacsie7() {
      boolean parne = false;
      boolean trojkou = false;
      boolean stvorkou = false;
      boolean patkou = false;
      boolean setkou = false;
      boolean sedmickou = false;
      boolean osmickou = false;
      boolean devinou = false;
      int dvojky = 0;
      int trojky = 0;
      int stvorky = 0;
      int patky = 0;
      int sestky = 0;
      int sedmicky = 0;
      int osmicky = 0;
      int deviny = 0;
      for (int i = 9999999 ; i > 0; i--){
          int y = i;
          int num;
          while (y > 0){
              num = y % 10;
              y = y / 10;
              if (num == 2){
                  dvojky += 1;
              }
              if (num == 3){
                  trojky += 1;
              }
              if (num == 4){
                  stvorky += 1;
              }
              if (num == 5){
                  patky += 1;
              }
              if (num == 6){
                  sestky += 1;
              }
              if (num == 7){
                  sedmicky += 1;
              }
              if (num == 8){
                  osmicky += 1;
              }
              if (num == 9){
                  deviny += 1;
              }
              num = 0;
          }
          if ((dvojky > 1) || (trojky > 1) || (stvorky > 1) || (patky > 1) || (sestky > 1) || (sedmicky > 1) || (osmicky > 1) || (deviny > 1)){
              parne = false;
              trojkou = false;
              stvorkou = false;
              patkou = false;
              setkou = false;
              osmickou = false;
              devinou = false;
              dvojky = 0;
              trojky = 0;
              stvorky = 0;
              patky = 0;
              sestky = 0;
              sedmicky = 0;
              osmicky = 0;
              deviny = 0;
          }
          else {
              if (dvojky == 1) {
                  if ((i % 2) == 0) {
                      parne = true;
                  } else {
                      parne = false;
                  }
              }
              else {
                  parne = true;
              }
              if (trojky == 1) {
                  if ((i % 3) == 0){
                      trojkou = true;
                  }
                  else {
                      trojkou = false;
                  }
              } else {
                  trojkou = true;
              }
              if (stvorky == 1) {
                  if ((i % 4) == 0) {
                      stvorkou = true;
                  } else {
                      stvorkou = false;
                  }
              }
              else {
                  stvorkou = true;
              }
              if (patky == 1) {
                  if ((i % 5) == 0) {
                      patkou = true;
                  } else {
                      patkou = false;
                  }
              }
              else {
                  patkou = true;
              }
              if (sestky == 1) {
                  if ((parne == true) & (trojkou == true)) {
                      setkou = true;
                  } else {
                      setkou = false;
                  }
              } else {
                  setkou = true;
              }
              if (sedmicky == 1) {
                  if ((i % 7) == 0) {
                      sedmickou = true;
                  } else {
                      sedmickou = false;
                  }
              } else {
                  sedmickou = true;
              }
              if (osmicky == 1) {
                  if ((i % 8) == 0){
                      osmickou = true;
                  }
                  else {
                      osmickou = false;
                  }
              } else {
                  osmickou = true;
              }
              if (deviny == 1) {
                  if ((i % 9) == 0){
                      devinou = true;
                  } else {
                      devinou = false;
                  }
              } else {
                  devinou = true;
              }
              if ((parne == true) & (trojkou == true) & (stvorkou == true) & (patkou == true) & (setkou == true) & (sedmickou == true) & (osmickou == true) & (devinou == true)) {
                  return i;
              }
          }
          parne = false;
          trojkou = false;
          stvorkou = false;
          patkou = false;
          setkou = false;
          osmickou = false;
          devinou = false;
          dvojky = 0;
          trojky = 0;
          stvorky = 0;
          patky = 0;
          sestky = 0;
          sedmicky = 0;
          osmicky = 0;
          deviny = 0;
      }
      return -1;
  }
 
  public static void main(String[] args) {
      System.out.println(najvacsie7());
  }
}