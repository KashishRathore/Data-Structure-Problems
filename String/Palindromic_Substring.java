public class Palindromic_Substring {
    public static boolean isPalindrome(String s, int start, int end) {
        while(start < end){
            if(s.charAt(start) != s.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static int countSubstrings(String s){
        int ans = 0;
        for(int i=0; i<s.length(); i++){
            for(int j=i; j<s.length(); j++){
                if(isPalindrome(s, i, j)){
                    ans++;
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        String s = "abc";
        System.out.println(countSubstrings(s));
    }
}
