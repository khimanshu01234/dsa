import java.util.Collections;
import java.util.PriorityQueue;

public class heapsAndHashingQ4 {
    int[] kLargest(int[] arr, int n, int k) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        for (int num : arr) {
            priorityQueue.add(num);
            if (priorityQueue.size() > k) priorityQueue.poll();
        }
        int[] ans = new int[k];
        for (int i = k-1; i >= 0; i--) ans[i] = priorityQueue.poll();
        return ans;
    }
}
