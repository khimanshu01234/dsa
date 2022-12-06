import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
public class ArrayQ16 {
    static int search(int[] numbers, int target,int low, int high){
        while (low <= high){
            int mid = (low + high)/2;
            if(numbers[mid] == target){
                if(target >= 0) {
                    while (mid < high && numbers[mid]==numbers[mid+1])mid++;
                    return Math.min(mid + 1, numbers.length - 1);
                } else {
                    while (mid > low && numbers[mid]==numbers[mid-1])mid--;
                    return Math.max(mid - 1, 0);
                }
            }
            if (numbers[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        if(target >= 0) {
            return Math.min(low, numbers.length - 1);
        } else {
            return Math.max(high, 0);
        }
    }
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new LinkedList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++){
            if(i != 0 && nums[i]==nums[i-1])continue;
            int target = -nums[i], low, high;
            if(target >= 0) {
                low = i+1; high = search(nums, -nums[low]+target, low,nums.length-1);
            } else {
                high = search(nums,0,i+1,nums.length-1);
                low = search(nums,target,i+1,nums.length-1);
            }
            while (low < high){
                if(nums[low] + nums[high] == target){
                    ans.add(Arrays.asList(nums[i],nums[low],nums[high]));
                    while (low < high && nums[low]==nums[low+1])low++;
                    while (low < high && nums[high]==nums[high-1])high--;
                    low++;high--;
                }
                else if(nums[low] + nums[high] > target)high--;
                else low++;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] nums = {0,0,0,0};
        List<List<Integer>> ans = threeSum(nums);
        for (List<Integer> i : ans){
            System.out.println(i);
        }
    }
}
