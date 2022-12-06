public class Array2DQ4T2 {
    public static void rotate(int[][] matrix) {
        for(int i = 0; i < matrix.length; i++) {
            for (int j = i + 1; j < matrix.length; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
            for (int j = 0; j < matrix.length/2; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][matrix.length - j - 1];
                matrix[i][matrix.length - j - 1] = temp;
            }
        }
    }
    public static void main(String[] args) {
        int[][] matrix = {{2,29,20,26,16,28},{12,27,9,25,13,21},{32,33,32,2,28,14},
                {13,14,32,27,22,26},{33,1,20,7,21,7},{4,24,1,6,32,34}};
        for (int[] i : matrix){
            for (int j : i)
                System.out.print(j + " ");
            System.out.println();
        }
        System.out.println();
        rotate(matrix);
        for (int[] i : matrix){
            for (int j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
