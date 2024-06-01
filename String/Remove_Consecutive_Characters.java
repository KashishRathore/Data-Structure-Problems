import java.util.Stack;

public class Remove_Consecutive_Characters{
    public static String removeConsecutiveCharacter(String s){
        Stack<Character> set = new Stack<>();
        String str = "";
        set.push(s.charAt(0));
        for(int i=1; i<s.length(); i++){
            char sb = set.peek();
            if(sb == s.charAt(i)){
                continue;
            }
            else{
                set.push(s.charAt(i));
            }
        }

        for(Character ch : set){
            str += ch;
        }
        return str;
    }
    public static void main(String[] args) {
        String s = "aabb"; 
        System.out.println(removeConsecutiveCharacter(s));
    }
}