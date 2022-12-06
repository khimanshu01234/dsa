import java.util.ArrayList;
import java.util.List;
public class Array2DQ3 {
    public static List<Integer> spiralOrder(int[][] matrix) {
        int minRow = 0, minCol = 0, maxRow = matrix.length - 1, maxCol = matrix[0].length - 1
                , size = matrix.length*matrix[0].length;
        List<Integer> ans = new ArrayList<>(size);
        while (minCol <= maxCol && minRow <= maxRow) {
            for (int j = minCol; j <= maxCol; j++) {
                ans.add(matrix[minRow][j]);
            }minRow++;
            for (int i = minRow; i <= maxRow; i++) {
                ans.add(matrix[i][maxCol]);
            } maxCol--;
            if(minCol > maxCol || minRow > maxRow) break;
            for (int j = maxCol; j >= minCol; j--) {
                ans.add(matrix[maxRow][j]);
            } maxRow--;
            for (int i = maxRow; i >= minRow; i--) {
                ans.add(matrix[i][minCol]);
            } minCol++;
        }
        return ans;
    }
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3}};
        List<Integer> ans = spiralOrder(matrix);
        for (int i : ans){
            System.out.print(i + " ");
        }
    }
}
