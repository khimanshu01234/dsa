public class heapsAndHashingQ6 {
    static int heap_size;
    static void MinHeapify(int i, int[] nums) {
        int l = (2 * i + 1);
        int r = (2 * i + 2);
        int smallest = i;
        if (l < heap_size && nums[l] < nums[i]) smallest = l;
        if (r < heap_size && nums[r] < nums[smallest]) smallest = r;
        if (smallest != i) {
            int temp = nums[i];
            nums[i] = nums[smallest];
            nums[smallest] = temp;
            MinHeapify(smallest, nums);
        }
    }
    static int extractMin(int[] nums) {
        heap_size--;
        int temp = nums[0];
        nums[0] = nums[heap_size];
        MinHeapify(0, nums);
        return temp;
    }
    public static int kthSmallest(int[] nums, int l, int r, int k) {
        heap_size = nums.length;
        for (int i = nums.length/2-1; i >= 0; i--) MinHeapify(i, nums);
        for (int i = 0; i < k-1; i++) extractMin(nums);
        return extractMin(nums);
    }
}
