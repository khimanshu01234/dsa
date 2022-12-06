public class BitManipulationQ4 {
    static int findPosition(int N) {
        return ((N & (N-1)) == 0 && N != 0) ? (int)(Math.log(N)/Math.log(2)) + 1: -1;
    }
}
