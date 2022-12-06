public class ArrayQ7 {
    public void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public void nextPermutation(int[] nums) {
        int i= nums.length-2;
        for (; i >= 0; i--){
            if(nums[i] < nums[i+1]){
                break;
            }
        }
        if(i!=-1) {
            int j = nums.length - 1;
            for (; j > i; j--) {
                if (nums[i] < nums[j]) {
                    break;
                }
            }
            swap(nums, i, j);
        }
        int s = i+1, e = nums.length-1;
        while(s<e){
            swap(nums,s,e);
            s++; e--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {4,2,0,2,3,2,0};
        ArrayQ7 l = new ArrayQ7();
        l.nextPermutation(arr);
        for (int i : arr){
            System.out.print(i+" ");
        }
    }
}
