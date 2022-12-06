public class BitManipulationQ3 {
    public static boolean isPowerofTwo(long n){
        return n!=0 && (n&(n-1)) == 0;
    }
}
