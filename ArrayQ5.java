import java.util.ArrayList;
import java.util.Collections;

public class ArrayQ5 {
    public long findMinDiff (ArrayList<Integer> a, int n, int m) {
        Collections.sort(a);
        int min_diff = Integer.MAX_VALUE;
        for(int i = 0; i < n-m+1; i++){
            int diff = a.get(i+m-1)-a.get(i);
            if(diff < min_diff){
                min_diff = diff;
            }
        }
        return min_diff;
    }
}
