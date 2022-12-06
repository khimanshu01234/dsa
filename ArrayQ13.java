public class ArrayQ13 {
    public int maxProduct(int[] nums) {
        int maxVal = nums[0], minVal = nums[0], res = nums[0];
        for(int i = 1; i < nums.length;i++){
            int temp = maxVal;
            maxVal = Math.max(Math.max(maxVal*nums[i],minVal*nums[i]),nums[i]);
            minVal = Math.min(Math.min(temp*nums[i],minVal*nums[i]),nums[i]);
            res = Math.max(res,maxVal);
        }
        return res;
    }
}
