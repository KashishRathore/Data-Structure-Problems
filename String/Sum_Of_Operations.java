package String;

public class Sum_Of_Operations {
    public static int sumOfOperations(String[] operations){
         int x = 0;
         for(int i=0; i<operations.length; i++){
            if(operations[i] == "++X" || operations[i] == "X++"){
               x++;
            }
            else{
                x--;
            }
         }
         return x;
    }
    public static void main(String[] args) {
        String[] operations = {"++X" , "X++" , "--X"};
        System.out.println(sumOfOperations(operations));
    }
}
