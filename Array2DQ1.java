public class Array2DQ1 {
    public static int[] findDiagonalOrder(int[][] mat) {
        int r = 0, c= 0 , row = mat.length, col = mat[0].length;
        int[] ans = new int[row*col];
        for(int i = 0; i < ans.length; i++){
            ans[i] = mat[r][c];
            if((r+c) % 2 == 0) {
                if (c == col - 1) {r++;}
                else if (r == 0) {c++;}
                else {c++;r--;}
            } else {
                if(r == row - 1) {c++;}
                else if(c == 0) {r++;}
                else {r++; c--;}
            }
        }
        return ans;
    }
}
