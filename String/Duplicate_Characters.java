import java.util.HashMap;
import java.util.Map;
public class Duplicate_Characters {
    //Print all the duplicate characters in a string
    public static void printDups(String str){
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i=0; i<str.length(); i++){
            if(map.containsKey(str.charAt(i))){
                map.put(str.charAt(i), map.get(str.charAt(i))+1);
            }
            else{
                map.put(str.charAt(i), 1);
            }
        }

        //printing
        for(Map.Entry<Character, Integer> mapElement : map.entrySet()){
            if(mapElement.getValue() > 1){
                System.out.println(mapElement.getKey() + " , count = " + mapElement.getValue());
            }
        }
    }

    public static void main(String[] args) {
        String str = "test string";
        printDups(str);
    }
}
