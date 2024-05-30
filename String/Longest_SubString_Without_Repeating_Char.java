import java.util.HashSet;

public class Longest_SubString_Without_Repeating_Char {
// Given a string s, find the length of the longest substring without repeating characters.
    public static int lengthOfLongestSubstring(String s){
        HashSet<Character> set = new HashSet<>(256);
        int i=0, j=0, maxLength = 0;
        while(j<s.length()){
            if(!set.contains(s.charAt(j))){
                set.add(s.charAt(j));
                j++;
                maxLength = Math.max(maxLength, set.size());
            }
            else{
                set.remove(s.charAt(i));
                i++;
            }
        }
        return maxLength;
    }
    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println(lengthOfLongestSubstring(s));
    }
}
