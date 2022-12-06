public class ArrayQ12 {
    public static int[] productExceptSelf(int[] nums) {
        int[] res = new int[nums.length];
        res[nums.length-1] = 1;
        for(int i = nums.length-2; i >= 0; i--){
            res[i] = res[i+1]*nums[i+1];
        }
        int left = 1;
        for (int i = 1; i < nums.length; i++){
            left *= nums[i-1];
            res[i] *= left;
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int[] arr1 = productExceptSelf(arr);
        for (int i : arr1){
            System.out.print(i+" ");
        }
        System.out.println();
    }
}
