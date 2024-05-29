import java.util.HashSet;

public class Contains_Duplicates {
    public static boolean duplicate(int[] nums){
        HashSet<Integer> set = new HashSet<>();

        for(int i=0; i<nums.length; i++){
            if(!set.contains(nums[i])){
                set.add(nums[i]);
            }
            else{
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
        System.out.println(duplicate(nums));
    }
}
