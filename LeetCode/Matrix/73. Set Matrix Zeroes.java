import java.util.Arrays;

public class SetMatrixZeroes {
    public static void main(String[] args) {
        SetMatrixZeroes obj = new SetMatrixZeroes();
        int[][] test1 = {{1, 1, 1}, {1, 0, 1}, {1, 1, 1}};
        System.out.println("original =" + Arrays.deepToString(test1));
        obj.setZeroes(test1);
        System.out.println("output =" + Arrays.deepToString(test1));
        
        int[][] test2 = {{0, 1, 2, 0}, {3, 4, 5, 2}, {1, 3, 1, 5}};
        System.out.println("original =" + Arrays.deepToString(test2));
        obj.setZeroes(test2);
        System.out.println("output =" + Arrays.deepToString(test2));
    }

    public void setZeroes(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        boolean[] rows = new boolean[n];
        boolean[] cols = new boolean[m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] == 0) {
                    rows[i] = true;
                    cols[j] = true;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if ((rows[i]) || (cols[j])) {
                    matrix[i][j] = 0;
                }
            }
        }
    }
}
