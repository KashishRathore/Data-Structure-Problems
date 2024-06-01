import java.util.ArrayList;

public class Count_Palindromic_subSequences {
    static boolean isPalindrome(String str, int start, int end){
        while(start < end){
            if(str.charAt(start) != str.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
    
    static void subSequence(String str,String currChar, ArrayList<String> newStr,int idx){
        if(str.length() == idx){
            newStr.add(currChar);
            return;
        }
        subSequence(str,currChar+str.charAt(idx), newStr, idx+1);
        subSequence(str,currChar, newStr, idx+1);
    }
    
    static long countPS(String str)
    {
        // Your code here
        int idx = 0;
        ArrayList<String> newStr = new ArrayList<>();
        
        subSequence(str,"", newStr, idx);
        
        int count = 0;
        
        for(int i=0; i<newStr.size(); i++){
            if(newStr.get(i) != "" && isPalindrome(newStr.get(i),0,newStr.get(i).length()-1) == true){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        String str = "abcd";
        System.out.println(countPS(str));
    }
}
