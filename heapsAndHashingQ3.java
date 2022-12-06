import java.util.*;

public class heapsAndHashingQ3 {
    public int[] topKFrequent(int[] nums, int k, int n) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) map.put(num, map.getOrDefault(num, 0)+1);
        PriorityQueue<Map.Entry<Integer, Integer>> priorityQueue = new
                PriorityQueue<>((Comparator.comparingInt(Map.Entry::getValue)));
        for (Map.Entry<Integer, Integer> entry : map.entrySet()){
            priorityQueue.add(entry);
            if(priorityQueue.size() > k) priorityQueue.poll();
        }
        int[] ans = new int[k];
        for (int i = 0; i < k; i++) ans[i] = priorityQueue.poll().getKey();
        return ans;
    }
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) map.put(num, map.getOrDefault(num, 0)+1);
        List<Integer>[] arr = new LinkedList[nums.length+1];
        for(int key : map.keySet()){
            int freq = map.get(key);
            if(arr[freq] == null) arr[freq] = new LinkedList<>();
            arr[freq].add(key);
        }
        int[] ans = new int[k];
        int idx = 0;
        for(int i = arr.length-1; i > 0; i--)
            if(arr[i] != null)
                for(int j : arr[i]) {
                    ans[idx++] = j;
                    if(idx == k) return ans;
                }
        return ans;
    }
}
