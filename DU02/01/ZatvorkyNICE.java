import java.util.*;

public class Zatvorky {

    public static char[] brackets = {'{', '(', '[', '<','}',')',']','>'};

    public static boolean dobreUzatvorkovany(String s){
        return "".equals(dopln(s));
    }

    public static String dopln(String s){
        Stack<Character> stack = new Stack<>();

        StringBuilder order = new StringBuilder();
        String correct_s = "";

        outerloop:
        for (int i = 0; i < s.length(); i++){
            char bracket = s.charAt(i);
            boolean wrong_character = true;
            for (int j = 0; j < Zatvorky.brackets.length/2; j++){
                if (bracket == Zatvorky.brackets[j]){
                    wrong_character = false;
                    stack.push(Zatvorky.brackets[brackets.length/2+j]);
                    break;
                }
                else if (bracket == Zatvorky.brackets[brackets.length/2+j]){
                    wrong_character = false;
                    if (bracket != stack.pop()){
                        return null;
                    }
                    break;
                }
            }

            if (wrong_character){
                return null;
            }

            if (i == s.length()-1){
                while (!stack.empty()){
                    order.append(stack.pop());
                }
                correct_s = order.toString();
            }
        }

        return correct_s;
    }


    public static void main(String[] args) {
        System.out.println(dobreUzatvorkovany(""));
        System.out.println(dobreUzatvorkovany("[]<>[<>]"));
        System.out.println(dobreUzatvorkovany("[]<>[<>"));
        System.out.println(dopln("[]<>[<>"));
    }

}
