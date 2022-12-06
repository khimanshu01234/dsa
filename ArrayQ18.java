import java.util.Scanner;

public class ArrayQ18 {
    static int findPivot(int[] arr){
        int low = 0, high = arr.length - 1;
        while (low <= high){
            int mid = (low + high)/2;
            if(mid < arr.length-1 && arr[mid] > arr[mid+1]){
                return mid;
            } else if(arr[low] <= arr[mid]){
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return arr.length-1;
    }
    static boolean pairInSortedRotated(int arr[], int target){
        int n = arr.length;
        int high = findPivot(arr), low = (n+high+1)%n;
        while (high!=low){
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

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-->0){
            int size = scan.nextInt();
            int target = scan.nextInt();
            int[] arr = new int[size];
            for (int i = 0 ; i < size; i++){
                arr[i] = scan.nextInt();
            }
            if(pairInSortedRotated(arr,target)){
                System.out.println("YES");
            }else {
                System.out.println("NO");
            }
        }
    }
}
