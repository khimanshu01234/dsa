public class ArrayQ17 {
    public static int maxArea(int[] height) {
        int left = 0, right = height.length-1, ans = 0,x;
        while (left < right){
            int y = right-left;
            if(height[left] < height[right])x = height[left++];
            else x = height[right--];
            int area = x*y;
            if(area > ans){
                ans = area;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] height = {1,1};
        System.out.println(maxArea(height));
    }
}
