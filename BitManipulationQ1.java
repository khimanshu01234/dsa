public class BitManipulationQ1 {
    static int setBits(int N) {
        int count = 0;
        while (N > 0){
            N = N & N-1;
            count++;
        }
        return count;
    }
    public static void main(String[] args) {

    }
}
