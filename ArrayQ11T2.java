public class ArrayQ11T2 {
    public static int trap(int[] height) {
        int left = 0, right = height.length-1, leftMax = height[left], rightMax = height[right], res = 0;
        while(left <= right){
            if(leftMax <= rightMax){
                if(height[left] > leftMax){
                    leftMax = height[left];
                } else {
                    res += leftMax - height[left];
                }
                left++;
            }
            else {
                if(height[right]>rightMax){
                    rightMax = height[right];
                } else {
                    res += rightMax - height[right];
                }
                right--;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int[] arr = {5,5,1,7,1,1,5,2,7,6};
        System.out.println(trap(arr));
    }
}
