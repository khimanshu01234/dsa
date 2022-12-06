public class BitManipulationQ2P2 {
    public static int singleNumber(int[] nums) {
        int ans = 0;
        for (int i = 0; i < 32; i++){
            int sum = 0;
            for (int j : nums){
                sum += (j>>i)&1;
            }
            sum = sum%3;
            ans += sum << i;
        }
        return ans;
    }
}
