import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class ArrayQ20 {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, Comparator.comparingInt(o -> o[0]));
        ArrayList<int[]> list = new ArrayList<>();
        int s = intervals[0][0], e = intervals[0][1];
        for(int i = 0; i < intervals.length; i++){
            if(intervals[i+1][0] <= e){
                e = Math.max(intervals[i+1][1],e);
            } else {
                list.add(new int[]{s,e});
                s = intervals[i+1][0];
                e = intervals[i+1][1];
            }
        }
        list.add(new int[]{s,e});
        return list.toArray(new int[0][]);
    }
}
