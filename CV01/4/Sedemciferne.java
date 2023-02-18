public class Sedemciferne {
 
    public static boolean uniqueDigits(int number) {
        String number0 = Integer.toString(number);
        number0 = number0.replaceAll("0", "");
        if (number0.length() != 7){ //ak sa tam vyskytli 0, nie je to hladane cislo
            return false;
        }
        number0 = number0.replaceFirst("1", ""); //replace 1. výskyt každej cifry
        number0 = number0.replaceFirst("2", "");
        number0 = number0.replaceFirst("3", "");
        number0 = number0.replaceFirst("4", "");
        number0 = number0.replaceFirst("5", "");
        number0 = number0.replaceFirst("6", "");
        number0 = number0.replaceFirst("7", "");
        number0 = number0.replaceFirst("8", "");
        number0 = number0.replaceFirst("9", "");
        if (number0.isEmpty()){ //ak nahradil vsetky cifry, sú rozne
            return true;
        }
        return false; //inak boli aspon 2 cifry rovnake
    }
  public static int najvacsie7() {
        boolean rightNumber;
        int copy = 1;
    for (int i = 9876543; i >= 1234567; --i) {
        if (uniqueDigits(i)) {
            rightNumber = true;
            copy = i;
            for (int j = 1; j <= 7; ++j){
                if (i % (copy % 10) != 0){
                    rightNumber = false;
                    break;
                }
                copy /= 10;
            }
            if (rightNumber == true){
                return i;
            }
            }
    }
    return -1;
  }
 
  public static void main(String[] args) {
      System.out.println(najvacsie7());
  }
}