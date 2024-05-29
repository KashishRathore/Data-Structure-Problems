public class Valid_Palindrome {
    public static boolean palindrome(String s){
        s = s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
        int start = 0;
        int end = s.length()-1;
        while (start < end) {
            if(s.charAt(start) != s.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println(palindrome(s));
    }
}
