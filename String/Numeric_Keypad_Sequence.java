public class Numeric_Keypad_Sequence {
    // Convert a sentence into its equivalent mobile numeric keypad sequence
    public static String printSequence(String[] str, String input) {
        String newStr = "";
        for (int i = 0; i < input.length(); i++) {
            if(input == " ") {
                newStr += 0;
            } 
            else{
                int position = input.charAt(i) - 'A';
                newStr += str[position];
            }
        }
        return newStr;

    }

    public static void main(String[] args) {
        String str[] = { "2", "22", "222", "3", "33", "333",
                "4", "44", "444", "5", "55", "555",
                "6", "66", "666", "7", "77", "777",
                "7777", "8", "88", "888", "9", "99",
                "999", "9999" };

        String input = "GEEKSFORGEEKS";
        System.out.println(printSequence(str, input));
    }
}
