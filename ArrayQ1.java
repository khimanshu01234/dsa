public class ArrayQ1 {
    public static int findSum(int[] A,int N) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i = 0 ;i < N;i++){
            max = Math.max(max,A[i]);
            min = Math.min(min,A[i]);
        }
        return max + min;
    }
}
