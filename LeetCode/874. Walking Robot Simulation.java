class Solution {
    public int robotSim(int[] commands, int[][] obstacles) {
        int x = 0;
        int y = 0;
        final int[][] nesw = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}}; // N = +y, E = +x, S = -y, W = -x
        Set<Pairs<Integer, Integer>> obstaclesSet = new HashSet<>();
        System.out.println(obstacles.length);
        for (int[] obstacle : obstacles) {
            obstaclesSet.add(new Pairs<>(obstacle[0], obstacle[1]));
        }
        int direction = 0;
        int maxDistance = 0;
        for (int command : commands) {
            if (command == -1) {
                direction = (direction + 1) % 4; // forward traversal i = (i+1)%n
            } else if (command == -2) {
                direction = (direction - 1 + 4) % 4; // backwards traversal i = (i-1+n)%n
            } else {
                for (int i = 1; i <= command; i++) {
                    if (obstaclesSet.contains(new Pairs<>(x + nesw[direction][0], y + nesw[direction][1]))) {
                        break;
                    }
                    x += nesw[direction][0];
                    y += nesw[direction][1];
                }
                maxDistance = Math.max(maxDistance, (x * x + y * y));
            }
        }
        return maxDistance;
    }
}
record Pairs<K, V>(K key, V value) {
}
