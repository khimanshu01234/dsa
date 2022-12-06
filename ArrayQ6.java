public class ArrayQ6 {
    public static int helper(int[] nums, int s, int l, int target){
        if(l==1){
            if(nums[s]==target)
                return s;
            return -1;
        }
        int mid = l/2;
        if(nums[s] < nums[s+mid]){
            if(nums[s] <= target && target < nums[s+mid]){
                return helper(nums,s,mid,target);
            }
            else {
                return helper(nums,s+mid,l-mid,target);
            }
        }
        else {
            if(nums[s+mid] <= target && target <= nums[s+l-1]){
                return helper(nums,s+mid,l-mid, target);
            }
            else {
                return helper(nums,s,mid,target);
            }
        }
    }
    public static int search(int[] nums, int target) {
        return helper(nums,0,nums.length,target);
    }

    public static void main(String[] args) {
        int[] arr = {2,3,4,5,6,7,8,9,1};
        System.out.println(search(arr,9));
    }
}
