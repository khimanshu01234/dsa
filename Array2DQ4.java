public class Array2DQ4 {
    public static void rotate(int[][] matrix) {
        int min = 0, max = matrix.length - 1;
        while (min < max) {
            for (int i = 0; i < max-min; i++){
                int temp = matrix[min][min+i];
                matrix[min][min+i] = matrix[max-i][min];
                matrix[max-i][min] = matrix[max][max-i];
                matrix[max][max-i] = matrix[min+i][max];
                matrix[min+i][max] = temp;
            }
            min++;max--;
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {{5,1,9,11},{2,4,8,10},{13,3,6,7},{15,14,12,16}};
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
