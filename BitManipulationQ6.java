public class BitManipulationQ6 {
    public static int nearestTwoPowX(int n){
        int ans = -1;
        while (n != 0){
            n = n>>1;
            ans++;
        }
        return ans;
    }
    public static int countSetBits(int n){
        if(n==0) return 0;
        int x = nearestTwoPowX(n);
        return x*(1<<x-1) + (n - (1<<x) + 1) + countSetBits(n - (1<<x));
    }

    public static void main(String[] args) {
        System.out.println(countSetBits(2));
    }
}
