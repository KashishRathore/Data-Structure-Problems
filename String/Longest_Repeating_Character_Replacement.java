public class Longest_Repeating_Character_Replacement {
    public static int characterReplacement(String s, int k){
        int[] count = new int[26];
        int i=0, j=0, max=Integer.MIN_VALUE, result=Integer.MIN_VALUE;
        while(i<s.length()){
            count[s.charAt(i) - 'A']++;
            max = Math.max(max, count[s.charAt(i) - 'A']);
            if((i-j+1)-max > k){
                count[s.charAt(i) - 'A']--;
                j++;
            }
            else{
                result = Math.max(result, i-j+1);
                i++;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        String s = "ABAB";
        int k = 2;
        System.out.println(characterReplacement(s,k));
    }
}
