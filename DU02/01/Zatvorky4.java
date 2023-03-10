import java.util.Stack;

public class Zatvorky {
    public static boolean dobreUzatvorkovany(String s) {
        Stack<Character> stack = new Stack<Character>();
        char current;
        char popped;
        for (int i = 0; i < s.length(); i++) {
            current = s.charAt(i);
            if (current == '(' || current == '[' || current == '<' || current == '{') {
                stack.push(current);
            }
            else {
                if (stack.isEmpty()) {
                    return false;
                }
                popped = stack.pop();
                if ((popped == '(' && current == ')') ||
                        (popped == '[' && current == ']') ||
                        (popped == '{' && current == '}') ||
                        (popped == '<' && current == '>')) {
                    continue;
                }
                return false;
            }

        }
        if (stack.isEmpty() == false) {
            return false;
        }
        return true;
    }

    public static String dopln(String s){
        Stack<Character> stack = new Stack<Character>();
        String out = "";
        char current;
        char popped;
        for (int i = 0; i < s.length(); i++) {
            current = s.charAt(i);
            if (current == '(' || current == '[' || current == '<' || current == '{') {
                stack.push(current);
            }
            else {
                if (stack.isEmpty()) {
                    return null;
                }
                popped = stack.pop();
                if ((popped == '(' && current == ')') ||
                        (popped == '[' && current == ']') ||
                        (popped == '{' && current == '}') ||
                        (popped == '<' && current == '>')) {
                    continue;
                }
                //neocakavany znak
                return null;
            }

        }
        if (stack.isEmpty() == false) {
            while (stack.isEmpty() == false) {
                popped = stack.pop();
                switch (popped) {
                    case '(':
                        out += ')';
                        break;
                    case '[':
                        out += ']';
                        break;
                    case '{':
                        out += '}';
                        break;
                    case '<':
                        out += '>';
                }
            }
        }
        return out;
    }
}
