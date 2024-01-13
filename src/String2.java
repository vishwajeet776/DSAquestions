import java.util.Stack;
public class String2 {
    public static boolean valid_parentheses(String s){
        Stack<Character> stack=new Stack<Character>();
        for (char c:s.toCharArray()){
            if (c=='('){
                stack.push(')');
            } else if (c=='{') {
                stack.push('}');
            } else if (c=='[') {
                stack.push(']');
            }
            else if (stack.isEmpty()||stack.pop()!=c){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String s="({{}[}";
        if (valid_parentheses(s)){
            System.out.println("valid_parentheses");
        }
        else {
            System.out.println("note valid");
        }
    }
}
