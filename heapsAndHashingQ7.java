public class heapsAndHashingQ7 {
    int maxRepeating(int[] arr, int n, int k) {
        for (int i = 0; i < n; i++) arr[arr[i]%k] += k;
        int idx = -1, max = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++)
            if(arr[i]-arr[i]%k > max){
                max = arr[i]-arr[i]%k;
                idx = i;
            }
        return idx;
    }
}
