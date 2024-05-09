package String;

public class Goal_Parser_Interpretation {
    public static String goalInterpretation(String command){
        return command.replace("()", "o").replace("(al)","al");
    }
    public static void main(String[] args) {
        String command = "G()(al)";
        System.out.println(goalInterpretation(command));
    }
}
