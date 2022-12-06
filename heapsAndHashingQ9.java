import java.util.ArrayList;
import java.util.List;

public class heapsAndHashingQ9 {
    public int binarySearch(int[] arr, int s, int e, int x){
        if(x < arr[0]) return 0;
        if(x > arr[arr.length-1]) return arr.length-1;
        while (s <= e){
            int mid = (s+(e-s)/2);
            if(arr[mid] == x) return mid;
            else if(arr[mid] > x) e = mid-1;
            else s = mid+1;
        }
        if(Math.abs(arr[s]-x) < Math.abs(arr[e]-x)) return s;
        return e;
    }
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> ans = new ArrayList<>(k);
        int idx = binarySearch(arr,0,arr.length,x);
        int left = idx, right = idx;
        while (left != 0 && right != arr.length-1 && right-left+1 != k){
            if(Math.abs(arr[left-1]-x) <= Math.abs(arr[right+1]-x)) left--;
            else right++;
        }
        while(left==0 && right-left+1 != k) right++;
        while(right == arr.length-1 && right-left+1 != k) left--;
        for(int i = left; i <= right; i++) ans.add(arr[i]);
        return ans;
    }
}
