public class BitManipulationQ5 {
    public static int countBitsFlip(int a, int b){
        int temp = a ^ b, count = 0;
        while (temp != 0){
            temp = temp & temp-1;
            count++;
        }
        return count;
    }
}
