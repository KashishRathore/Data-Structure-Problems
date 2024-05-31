public class Longest_Palindromic_Substring {
    public static boolean isPalindrome(String s){
        int start = 0;
        int end = s.length()-1;
        while(start < end){
            if(s.charAt(start) != s.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static String longestPalindrome(String s){
        if(s.length()-1 <= 1) return s;

        int maxLength = 1;
        String str = "";

        for(int i=0; i<s.length(); i++){
            for(int j= i + maxLength; j<s.length(); j++){
                if(j - i > maxLength && isPalindrome(s.substring(i, j))){
                    maxLength = j - i;
                    str = s.substring(i, j);
                }
            }
        }
        return str;
    }
    public static void main(String[] args) {
        String s = "babad";
        System.out.println(longestPalindrome(s));
    }
}
