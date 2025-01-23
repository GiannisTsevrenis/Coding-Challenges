class Solution {
    public int countServers(int[][] grid) {
        int serverCount = 0;
        int m = grid.length;
        int n = grid[0].length;
        int[] rows = new int[m];
        int[] cols = new int[n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1) {
                    rows[i]++;
                    cols[j]++;
                }
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1 && (rows[i] > 1 || cols[j] > 1)) {
                    serverCount++;
                }
            }
        }
        return serverCount;
    }
}
// class Solution {
//     public int countServers(int[][] grid) {
//         int m = grid.length;
//         int n = grid[0].length;
//         int servers = 0;
//         HashSet<Point> set = new HashSet<>();
//         HashMap<Integer, ArrayList<Point>> rowMap = new HashMap<>();
//         HashMap<Integer, ArrayList<Point>> columnMap = new HashMap<>();
//         for (int i = 0; i < m; i++) {
//             for (int j = 0; j < n; j++) {
//                 if (grid[i][j] == 1) {
//                     rowMap.computeIfAbsent(i, k -> new ArrayList<>()).add(new Point(i, j));
//                     columnMap.computeIfAbsent(j, k -> new ArrayList<>()).add(new Point(i, j));
//                 }
//             }
//         }
//         for (Map.Entry<Integer, ArrayList<Point>> entry : rowMap.entrySet()) {
//             int totalPointsInRow = entry.getValue().size();
//             if (totalPointsInRow> 1){
//                 set.addAll(entry.getValue());
//             }
//         }
//         for (Map.Entry<Integer, ArrayList<Point>> entry : columnMap.entrySet()) {
//             int totalPointsInRow = entry.getValue().size();
//             if (totalPointsInRow> 1){
//                 set.addAll(entry.getValue());
//             }
//         }
//         return set.size();
//     }
//     public record Point(int x, int y) {
//     }
// }
