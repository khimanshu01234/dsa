import java.util.PriorityQueue;

public class heapsAndHashingQ11 {
    long minCost(long arr[], int n) {
        if(arr.length == 1) return arr[0];
        PriorityQueue<Long> priorityQueue = new PriorityQueue<>();
        for (long l : arr) priorityQueue.add(l);
        long ans = 0;
        while (priorityQueue.size() != 1){
            Long temp = priorityQueue.poll()+priorityQueue.poll();
            ans += temp;
            priorityQueue.add(temp);
        }
        return ans;
    }
}
