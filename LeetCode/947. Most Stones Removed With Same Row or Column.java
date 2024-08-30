import java.util.HashMap;
import java.util.Map;

class Solution {
    private Map<Integer, Integer> parent;
    private Map<Integer, Integer> rank;
    private int count;

    public int removeStones(int[][] stones) {
        parent = new HashMap<>();
        rank = new HashMap<>();
        // Initialize the Union-Find structure
        for (int[] stone : stones) {
            int row = -(stone[0] + 1); // Unique row identifier
            int col = stone[1] + 1;    // Unique column identifier
            parent.put(row, row);
            parent.put(col, col);
        }
        count = parent.size();
        // Union operations for each stone
        for (int[] stone : stones) {
            union(-(stone[0] + 1), stone[1] + 1);
        }
        // The result is the number of stones minus the number of disjoint sets
        return stones.length - count;
    }

    private int find(int x) {
        if (parent.get(x) != x) {
            parent.put(x, find(parent.get(x))); // Path compression
        }
        return parent.get(x);
    }

    private void union(int i, int j) {
        int iset = find(i);
        int jset = find(j);
        if (iset == jset) return;
        count--; // Decrease count of disjoint sets
        int isetRank = rank.getOrDefault(iset, 0);
        int jsetRank = rank.getOrDefault(jset, 0);
        if (isetRank < jsetRank) {
            parent.put(iset, jset);
        } else if (isetRank > jsetRank) {
            parent.put(jset, iset);
        } else {
            parent.put(jset, iset);
            rank.put(iset, isetRank + 1);
        }
    }
}
