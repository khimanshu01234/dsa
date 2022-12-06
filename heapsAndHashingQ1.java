import java.util.Arrays;

public class heapsAndHashingQ1 {
    int minDiff(int arr[], int N, int K) {
        Arrays.sort(arr);
        int min = Integer.MAX_VALUE;
        for (int i = 0, j = K-1; j < N; i++, j++)
            if(arr[j]-arr[i] < min) min = arr[j]-arr[i];
        return min;
    }
}
