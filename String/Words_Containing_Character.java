package String;

import java.util.ArrayList;
import java.util.List;

public class Words_Containing_Character {
    public static List<Integer> findWordsContaining(String[] words, String x){
        List<Integer> ans = new ArrayList<Integer>();
        for(int i=0; i<words.length; i++){
            if(words[i].indexOf(x) != -1){
                ans.add(i);
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        String[] words = {"leet","code"};
        String  x = "e";

        System.out.println(findWordsContaining(words, x));
    }
}
