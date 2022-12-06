public class ArrayQ15 {
    static int findPivot(int[] arr){
        int low = 0, high = arr.length - 1;
        while(low <= high){
            int mid = (low+high)/2;
            if(mid < arr.length-1 && arr[mid] > arr[mid+1]){
                return mid+1;
            } else if(arr[low] <= arr[mid]){
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return 0;
    }
    static boolean pairInSortedRotated(int[] arr, int target){
        int n = arr.length, low = findPivot(arr), high = (n+low-1)%n;
        while (low!=high){
            if(arr[low]+arr[high] == target){
                return true;
            } else if(arr[low]+arr[high] > target){
                high = (n+high-1)%n;
            } else {
                low = (low+1)%n;
            }
        }
        return false;
    }
}
