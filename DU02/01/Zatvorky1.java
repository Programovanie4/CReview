import java.util.Stack;
public class Zatvorky {
    public static boolean dobreUzatvorkovany(String s){

        int gulata = 0;
        int hranata = 0;
        int kucerva = 0;
        int ostra = 0;
        for (int i = 0; i < s.length(); i++){
            if (s.charAt(i) == '('){
                gulata++;
            }
            else if (s.charAt(i) == ')'){
                gulata--;
            }
            else if (s.charAt(i) == '['){
                hranata++;
            }
            else if (s.charAt(i) == ']'){
                hranata--;
            }
            else if (s.charAt(i) == '{'){
                kucerva++;
            }
            else if (s.charAt(i) == '}'){
                kucerva--;
            }
            else if (s.charAt(i) == '<'){
                ostra++;
            }
            else if (s.charAt(i) == '>'){
                ostra--;
            }

        }
        if(gulata == 0 && hranata == 0 && kucerva == 0 && ostra ==0) return true;
        return false;

    }
    public static String dopln(String s) {
        String vystup = "";
        Stack<Character> zasobnik = new Stack<Character>();
        if (dobreUzatvorkovany(s)) {
            return s;
        }
        for (int i = 0; i < s.length(); i++) {
            char zat = s.charAt(i);
            if (zat == '(' || zat == '[' || zat == '{' || zat == '<') {
                zasobnik.push(zat);
            } else if (zat == ')' || zat == ']' || zat == '}' || zat == '>') {
                if (zasobnik.isEmpty()) {
                    return null;
                }
                char check = zasobnik.pop();
                if ((zat == ')' && check != '(') || (zat == ']' && check != '[') || (zat == '}' && check != '{') || (zat == '>' && check != '<')) {
                    return null;
                }
            }
        }
        while (!zasobnik.isEmpty()) {
            char check = zasobnik.pop();
            char uzavor;
            if(check == '('){
                vystup = vystup +')';
            }
            else if(check == '['){
                vystup = vystup + ']';
            }
            else if(check == '{'){
                vystup = vystup + '}';
            }
            else if(check == '<'){
                vystup = vystup + '>';
            }
            else return null;
        }
        return vystup;
    }

    public static void main(String[] args) {

    }
}
