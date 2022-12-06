public class ArrayQ8 {
    public static int maxProfit(int[] prices) {
        int maxProfit = 0, minSoFar = prices[0];
        for(int i : prices){
            minSoFar = Math.min(i,minSoFar);
            int temp = i-minSoFar;
            if(temp > maxProfit){
                maxProfit = temp;
            }
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }
}
