import java.util.Arrays;

public class Valid_Anagram {
    public static boolean isAnagram(String s, String t){
        char[] schar = s.toCharArray();
        char[] tchar = s.toCharArray();

        Arrays.sort(schar);
        Arrays.sort(tchar);

        return Arrays.equals(schar, tchar);

    }
    public static void main(String[] args) {
        String s = "anagram", t = "nagaram";
        System.out.println(isAnagram(s, t));
    }
}
