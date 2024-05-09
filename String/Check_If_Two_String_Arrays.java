package String;

public class Check_If_Two_String_Arrays{
    public static boolean checkTwoString(String[] word1, String[] word2){
        StringBuilder str1 = new StringBuilder();
        StringBuilder str2 = new StringBuilder();
        for(String s : word1){
            str1.append(s);
        }
        for(String s : word2){
            str2.append(s);
        }
        return str1.toString().equals(str2.toString());
    }
    public static void main(String[] args) {
        String[] word1 = {"a", "bc"};
        String[] word2 = {"ab", "c"};

        System.out.println(checkTwoString(word1, word2));
    }
}
