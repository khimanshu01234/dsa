public class heapsAndHashingQ2 {
    void buildHeap(int arr[], int n) {
        for(int i = n/2-1; i >= 0; i--) heapify(arr, n, i);
    }
    void heapify(int arr[], int n, int i) {
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        int largest = i;
        if(left < n && arr[left] > arr[largest]) largest = left;
        if(right < n && arr[right] > arr[largest]) largest = right;
        if(largest != i) {
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;
            heapify(arr, n, largest);
        }
    }
    public void heapSort(int arr[], int n) {
        buildHeap(arr, n);
        int size = n;
        while (size > 1){
            int temp = arr[0];
            arr[0] = arr[size-1];
            arr[size-1] = temp;
            size--;
            heapify(arr, size, 0);
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        heapsAndHashingQ2 t = new heapsAndHashingQ2();
        t.buildHeap(arr, 5);
        for (int i : arr) System.out.print(i+" ");
    }
}
