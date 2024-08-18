import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    public static void main(String[] args) {
        System.out.println(new SpiralMatrix().spiralOrder(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}));
        System.out.println(new SpiralMatrix().spiralOrder(new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}}));
    }

    public List<Integer> spiralOrder(int[][] matrix) {
        int xEnd = matrix.length - 1;
        int xStart = 0;
        int yEnd = matrix[0].length - 1;
        int yStart = 0;
        List<Integer> result = new ArrayList<>();
        while (xStart <= xEnd && yStart <= yEnd) {
            //left -> right
            for (int i = yStart; i <= yEnd; i++) {
                result.add(matrix[xStart][i]);
            }
            xStart++;
            // top -> bottom
            for (int i = xStart; i <= xEnd; i++) {
                result.add(matrix[i][yEnd]);
            }
            yEnd--;
            // right -> left
            if (xStart <= xEnd) {
                for (int i = yEnd; i >= yStart; i--) {
                    result.add(matrix[xEnd][i]);
                }
                xEnd--;
            }
            // bottom -> top
            if (yStart <= yEnd) {
                for (int i = xEnd; i >= xStart; i--) {
                    result.add(matrix[i][yStart]);
                }
                yStart++;
            }
        }
        return result;
    }
}
