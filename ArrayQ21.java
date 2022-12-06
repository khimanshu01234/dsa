public class ArrayQ21 {
    static int findMinOps(int[] arr, int n) {
        int s = 0, e = n-1, ans = 0;
        while (s < e){
            if(arr[s]==arr[e]){
                s++; e--;
            } else if(arr[s] < arr[e]){
                arr[s+1] = arr[s]+arr[s+1];
                s++;ans++;
            } else {
                arr[e-1] = arr[e]+arr[e-1];
                e--;ans++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {99,15,14,11};
        System.out.println(findMinOps(arr,4));
    }
}
