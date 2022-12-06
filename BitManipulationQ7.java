public class BitManipulationQ7 {
    static int setSetBit(int x, int y, int l, int r){
        return x | (int)((1L << (r - l + 1)) - 1)<<(l-1) & y;
    }
    public static void main(String[] args) {
        System.out.println(setSetBit(100000000,1000000000,1,32));
    }
}
