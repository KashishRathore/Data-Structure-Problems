public class Longest_Common_Prefix {
//Write a function to find the longest common prefix string amongst an array of strings. If there is no common prefix, return an empty string "".
    public static String common(String s1, String s2){
        StringBuilder sb = new StringBuilder();
        int n = Math.min(s1.length(), s2.length());
        for(int i=0; i<n; i++){
            if(s1.charAt(i) == s2.charAt(i)){
                sb.append(s1.charAt(i));
            }
            else{
                break;
            }
        }
        return sb.toString();
    }
    public static String longestCommonPrefix(String[] strs) {
        String result = strs[0];
        for(int i=1; i<strs.length; i++){
            result = common(result, strs[i]);
        }
        return result;
    }
    public static void main(String[] args) {
        String[] strs = {"flower","flow","flight"};
        System.out.println(longestCommonPrefix(strs));
    }
}
