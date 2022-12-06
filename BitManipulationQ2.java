public class BitManipulationQ2 {
    public int[] singleNumber(int[] nums) {
        int xor = 0,a = 0, b = 0;
        for (int i : nums) xor ^= i;
        int temp = xor & -xor;
        for (int i : nums){
            if((i & temp) == temp) a ^= i;
            else b ^= i;
        }
        return new int[]{Math.min(a,b),Math.max(a,b)};
    }
}
