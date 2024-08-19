import Matrix.SpiralMatrix;

import java.util.Arrays;

public class RotateImage {
    public static void main(String[] args) {
        int[][] test1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        RotateImage rotateObj = new RotateImage();
        rotateObj.rotate(test1);
        System.out.println(Arrays.deepToString(test1));
    }
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        int temp;
        for (int i = 0; i < n; i++) {
            for (int j = i; j <n; j++) {
                    temp = matrix[i][j];
                    matrix[i][j] = matrix[j][i];
                    matrix[j][i]= temp;
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n / 2; j++) {
                temp  = matrix[i][j];
                matrix[i][j] = matrix[i][n-j-1];
                matrix[i][n-j-1] = temp;
            }
        }
    }
}
