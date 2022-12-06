public class heapsAndHashingQ8 {
    public static int countSubstr(int[] arr, int k) {
        for (int j : arr) if (j <= k) k++;
        return k;
    }
}
