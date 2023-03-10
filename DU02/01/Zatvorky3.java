import java.util.*;

public class Zatvorky {

    public static boolean dobreUzatvorkovany(String s){
        List<Character> queue = new ArrayList<>();
        char[] string = s.toCharArray();

        for (char c:string){
            if (c == '(' || c == '[' || c == '{' || c == '<'){
                queue.add(c);
            }else{
                if (c == ')'){
                    if (queue.get(queue.size()-1) != '('){
						return false;
                    }
					queue.remove(queue.size()-1);
                }else if(c == ']'){
                    if (queue.get(queue.size()-1)== '['){
                        queue.remove(queue.size()-1);
                    }else{
                        return false;
                    }
                }else if(c == '}'){
                    if (queue.get(queue.size()-1) == '{'){
                        queue.remove(queue.size()-1);
                    }else{
                        return false;
                    }
                }else if(c == '>'){
                    if (queue.get(queue.size()-1) == '<'){
                        queue.remove(queue.size()-1);
                    }else{
                        return false;
                    }
                }else{
                    return false;
                }
            }
        }
        //System.out.println(Arrays.toString(queue.toArray()));
        return queue.isEmpty();
    }


    public static String dopln(String s){
        System.out.println("Dopln: " + s);
        List<Character> queue = new ArrayList<>();
        char[] string = s.toCharArray();

        for (char c:string){
            if (c == '(' || c == '[' || c == '{' || c == '<'){
                queue.add(c);
            }else{
                if (c == ')'){
                    if (queue.get(queue.size()-1) == '('){
                        queue.remove(queue.size()-1);
                    }else{
                        return null;
                    }
                }else if(c == ']'){
                    if (queue.get(queue.size()-1)== '['){
                        queue.remove(queue.size()-1);
                    }else{
                        return null;
                    }
                }else if(c == '}'){
                    if (queue.get(queue.size()-1) == '{'){
                        queue.remove(queue.size()-1);
                    }else{
                        return null;
                    }
                }else if(c == '>'){
                    if (queue.get(queue.size()-1) == '<'){
                        queue.remove(queue.size()-1);
                    }else{
                        return null;
                    }
                }else{
                    return null;
                }
            }
        }
        System.out.println("Zostalo: " + Arrays.toString(queue.toArray()));
        if (queue.isEmpty()){
            return "";
        }
        StringBuilder result = new StringBuilder();
        for (int i=queue.size()-1; i>=0; i--){
            if (queue.get(i) == '('){
                result.append(')');
            }else if (queue.get(i)== '['){
                result.append(']');
            }else if (queue.get(i) == '{'){
                result.append('}');
            }else if (queue.get(i) == '<'){
                result.append('>');
            }
        }
        return result.toString();
    }


    public static void main(String[] args) {
        //System.out.println(dopln("{([(<{}[<>[]}>{[]{[(<()>"));
        //System.out.println(dopln("{([(<{}[<>[]]>{[]{[(<()>)]}})])}"));
        System.out.println(dopln("({<{<{[<[{{([{{{}()}<{}()>}<[{}]>]<<{{}<>}([]<>)>[({}<>){()[]}]>)[[([(){}][<><>])<<()>{()()}>]]}}[(<{[(<>)"));
        //System.out.println("]}>)]]>]}>}>})".equals("[)]}>)]]>]}>}>}]"));
    }
}