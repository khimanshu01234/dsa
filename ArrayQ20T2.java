import java.util.ArrayList;

public class ArrayQ20T2 {
    public int[][] merge(int[][] intervals) {
        int max = 0;
        for(int[] i: intervals){
            max = Math.max(max,i[1]);
        }
        int[] numberLine = new int[(max+1)*2];
        for(int[] i: intervals){
            numberLine[i[0]*2]++;
            numberLine[i[1]*2+1]--;
        }
        ArrayList<int[]> ans = new ArrayList<>();
        int start = 0;
        while(numberLine[start]==0){
            start++;
        }
        int sum = numberLine[start];
        for(int i = start+1; i < numberLine.length; i++){
            sum += numberLine[i];
            if(sum == 0) {
                ans.add(new int[]{start / 2, i / 2});
                while(i+1 < numberLine.length && numberLine[i+1]==0){
                    i++;
                }
                start = i+1;
            }
        }
        return ans.toArray(new int[0][]);
    }
}
