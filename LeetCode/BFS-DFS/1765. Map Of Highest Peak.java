class Solution {
public int[][] highestPeak(int[][] isWater) {
        Queue<int[]> queue = new LinkedList<>();
        int[][] result = new int[isWater.length][isWater[0].length];
        for (int i = 0; i < isWater.length; i++) {
            for (int j = 0; j < isWater[i].length; j++) {
                if (isWater[i][j] == 1) {
                    result[i][j] = 0;
                    queue.offer(new int[]{i, j});
                } else {
                    result[i][j] = -1;
                }
            }
        }
        while (!queue.isEmpty()) {
            int[] position = queue.poll();
            int i = position[0];
            int j = position[1];
            int height = result[i][j];
            int[] directionsX = {-1, 1, 0, 0};
            int[] directionsY = {0, 0, -1, 1};
            for (int k = 0; k < 4; k++) {
                int newX = i + directionsX[k];
                int newY = j + directionsY[k];
                if (newX < 0 | newX >= isWater.length | newY < 0 || newY >= isWater[0].length || result[newX][newY]!=-1) {
                    continue;
                }
                result[newX][newY] = height+1;
                queue.offer(new int[]{newX, newY});
            }
        }
        return result;
    }
}
