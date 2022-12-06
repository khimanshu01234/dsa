import java.util.HashSet;

public class ArrayQ4 {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int i : nums){
            if(!set.add(i)){
                return true;
            }
        }
        return false;
    }
}
