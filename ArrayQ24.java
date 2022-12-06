public class ArrayQ24 {
    static int longSubarrWthSumDivByK(int a[], int n, int k) {
        int[] remArr = new int[k];
        int sum = 0, ans = 0, temp = ((a[0]%k)+k) % k;
        remArr[0] = -1;
        for (int i = 0; i < n; i++){
            sum += a[i];
            int rem = ((sum%k)+k) % k;
            if(remArr[rem] != 0 || rem == temp){
                ans = Math.max(i - remArr[rem],ans);
            } else{
                remArr[rem] = i;
            }
        }
        return ans;
    }
}
