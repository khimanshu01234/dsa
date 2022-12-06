import java.util.PriorityQueue;

public class heapsAndHashingQ10 {
    static int[] kthLargest(int k, int[] arr, int n) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(k+1);
        int[] ans = new int[n];
        for (int i = 0; i < k-1; i++){
            priorityQueue.add(arr[i]);
            ans[i] = -1;
        }
        for(int i = k-1; i < n; i++){
            priorityQueue.add(arr[i]);
            if (priorityQueue.size() > k) priorityQueue.poll();
            ans[i] = priorityQueue.peek();
        }
        return ans;
    }
}
