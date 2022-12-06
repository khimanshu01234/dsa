import java.util.Stack;

public class heapsAndHashingQ5 {
    public static long[] nextLargerElement(long[] arr, int n){
        Stack<Integer> stack = new Stack<>();
        long[] ans = new long[n];
        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && arr[stack.peek()] < arr[i]) {
                ans[stack.pop()] = arr[i];
            }
            stack.push(i);
        }
        while (!stack.isEmpty()) ans[(int)stack.pop()] = -1;
        return ans;
    }
}
