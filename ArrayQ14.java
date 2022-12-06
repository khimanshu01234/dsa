public class ArrayQ14 {
    public static int findMin(int[] nums) {
        int low = 0, high = nums.length-1;
        while (low <= high){
            int mid = (low+high)/2;
            if(mid < nums.length-1 && nums[mid] > nums[mid+1] ){
                return nums[mid+1];
            } else if(nums[low] <= nums[mid]){
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return nums[0];
    }

    public static void main(String[] args) {
        int[] arr = {4,5,1,2,3};
        System.out.println(findMin(arr));
    }
}
