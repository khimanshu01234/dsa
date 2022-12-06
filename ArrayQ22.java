import java.util.Arrays;
import java.util.Comparator;

public class ArrayQ22 {
    public static String largestNumber(int[] nums) {
        String[] arr = new String[nums.length];
        for(int i = 0; i < nums.length;i++){
            arr[i] = String.valueOf(nums[i]);
        }
        Arrays.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
            String a = o1 + o2;
            String b = o2 + o1;
            return b.compareTo(a);
        }});
        if(arr[0].equals("0")){
            return String.valueOf(0);
        }
        StringBuilder ans = new StringBuilder();
        for(String i : arr){
            ans.append(i);
        }
        return ans.toString();
    }
    public static void main(String[] args) {
        int[] nums = {3,30,34,5,9};
        System.out.println(largestNumber(nums));
    }
}
