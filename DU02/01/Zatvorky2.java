import java.io.*;
import java.util.*;
public class Zatvorky {
    public static boolean dobreUzatvorkovany(String s){
        String o = "(";
        String k = "{";
        String h = "[";
        String sp = "<";
        String z = o+k+h+sp;
        Stack<Integer> stack = new Stack<Integer>();
        for (int i = 0; i < s.length(); i++){
            if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '<' || s.charAt(i) == '['){
                stack.push((int) s.charAt(i));
            }else {
                if(s.charAt(i) == ')') {
                    if (stack.pop() != '('){
                        return false;
                    }
                }else if (s.charAt(i) == '}'){
                    if (stack.pop() != '{'){
                        return false;
                    }
                }else if(s.charAt(i) == '>'){
                    if (stack.pop() != '<'){
                        return false;
                    }
                }else{
                    if (stack.pop() != '['){
                        return false;
                    }
                }
            }
        }
        return stack.empty();
    }

    public static String dopln(String s){
        StringBuilder r = new StringBuilder();
        StringBuilder ret = new StringBuilder();
        Stack<Integer> stack = new Stack<Integer>();
        for (int i = 0; i < s.length(); i++){
            if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '<' || s.charAt(i) == '['){
                stack.push((int) s.charAt(i));
            }else {
                if(s.charAt(i) == ')') {
                    int op = stack.pop();
                    if(op != '(' ){
                        return null;
                    }
                }else if (s.charAt(i) == '}'){
                    int op = stack.pop();
                    if(op != '{' ){
                        return null;
                    }
                }else if(s.charAt(i) == '>'){
                    int op = stack.pop();
                    if(op != '<' ){
                        return null;
                    }
                }else if(s.charAt(i) == ']'){
                    int op = stack.pop();
                    if(op != '['){
                        return null;
                    }
                }
            }
        }

        while(!stack.empty()){
            int t = stack.pop();
            System.out.println(t);
            if (t == '('){
                r.append(")");
            }
            else if (t == '{'){
                r.append("}");
            }
            else if (t == '['){
                r.append("]");
            }
            else if(t == '<'){
                r.append(">");
            }else{
                return null;
            }
        }

//            System.out.println(stack);
        return String.valueOf(r);


    }

    public static void main(String[] args) {
        String[] x = {"[({(<(())[]>[[{[]{<()<>>","[(()[<>])]({[<{<<[]>>(",
                    "{([(<{}[<>[]}>{[]{[(<()>", "(((({<>}<{<{<>}{[]{[]{}","[[<[([]))<([[{}[[()]]]",
                    "[{[{({}]{}}([{[{{{}}([]", "{<[[]]>}<{[{[{[]{()[[[]","[<(<(<(<{}))><([]([]()",
                     "<{([([[(<>()){}]>(<<{{","<{([{{}}[<[[[<>{}]]]>[]]"}; //)]}>)]]>]}>}>}
//        for(String e : x){
//            System.out.println(dobreUzatvorkovany(e));
//        }
        System.out.println(dopln("[<{{[[(({({<{{<>[]}[[][]]}[{{}()}[[][]]]>}{<[{()<>]<[]()>]{([][]){{}[]}}>})(([<[[]()][()()]><{[]}(<><"));
    }}
//[<{{[[(({({<]>}{<[{()<>]<[]()>]{([][]){{}[]}}>})(([<[[]()][()()]><{[]}(<><
//        System.out.println(dobreUzatvorkovany("{<{<{[<[{{([{{{}()}<{}()>}<[{}]>]<<{{}<>}([]<>)>[({}<>){()[]}]>)[[([(){}][<><>])<<()>{()()}>]]}}[(<{[(<>"));

