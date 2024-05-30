import java.util.Stack;

public class Valid_Parentheses {
// Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

    public static boolean isValid(String s){
        Stack<Character> set = new Stack<>();
        for(char c : s.toCharArray()){
            if(c == '('){
                set.push(')');
            }
            else if(c == '{'){
                set.push('}');
            }
            else if(c == '['){
                set.push(']');
            }
            else if(set.isEmpty() || set.pop() != c){
                return false;
            }
        }
        return set.isEmpty();
    }
    public static void main(String[] args) {
        String s = "()";
        System.out.println(isValid(s));
    }
}
