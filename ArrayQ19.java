import java.util.Collections;
import java.util.PriorityQueue;


//Not the best approach


public class ArrayQ19 {
    int heap_size;
    void MinHeapify(int i, int[] nums) {
        int l = (2 * i + 1);
        int r = (2 * i + 2);
        int largest = i;
        if (l < heap_size && nums[l] > nums[i]) largest = l;
        if (r < heap_size && nums[r] > nums[largest]) largest = r;
        if (largest != i) {
            int temp = nums[i];
            nums[i] = nums[largest];
            nums[largest] = temp;
            MinHeapify(largest, nums);
        }
    }
    int extractMin(int[] nums) {
        heap_size--;
        int temp = nums[0];
        nums[0] = nums[heap_size];
        MinHeapify(0, nums);
        return temp;
    }
    public int findKthLargest(int[] nums, int k) {
        heap_size = nums.length;
        for (int i = nums.length/2-1; i >= 0; i--) MinHeapify(i, nums);
        for (int i = 0; i < k-1; i++) extractMin(nums);
        return extractMin(nums);
    }
}
