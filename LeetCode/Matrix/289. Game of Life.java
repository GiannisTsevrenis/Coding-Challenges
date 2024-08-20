public class GameOfLife {
    public static void main(String[] args) {
        int[][] bb = new int[][]{{0, 1, 0}, {0, 0, 1}, {1, 1, 1}, {0, 0, 0}};
        int[][] cc = new int[][]{{1, 1}, {1, 0}};
        GameOfLife tester = new GameOfLife();
        tester.gameOfLife(bb);
        tester.gameOfLife(cc);
    }

    public void gameOfLife(int[][] board) {
        int m = board.length;
        int n = board[0].length;
        int[] dx = new int[]{0, 0, 1, -1, 1, -1, 1, -1};
        int[] dy = new int[]{1, -1, 0, 0, 1, -1, -1, 1};
        int[][] nextGeneration = new int[m][n];
        int aliveNeighbours, newX, newY;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                aliveNeighbours = 0;
                for (int k = 0; k < 8; k++) {
                    newX = i + dx[k];
                    newY = j + dy[k];
                    if ((newX < m && newX >= 0 && newY < n && newY >= 0) && board[newX][newY] == 1) {
                        aliveNeighbours++;
                    }
                }
                if (board[i][j] == 1) {
                    nextGeneration[i][j] = (aliveNeighbours < 2 || aliveNeighbours > 3) ? 0 : 1;
                } else {
                    nextGeneration[i][j] = (aliveNeighbours == 3) ? 1 : 0;
                }
            }
        }
        for (int i = 0; i < m; i++) {
            System.arraycopy(nextGeneration[i], 0, board[i], 0, n);
        }
    }
}
