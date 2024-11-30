class Solution {
    public int findChampion(int n, int[][] edges) {
        HashSet<Integer> hashSet = new HashSet<>();
        for (int i = 0; i < n; i++) {
            hashSet.add(i);
        }
        for (int[] edge : edges) {
            hashSet.remove(edge[1]);
        }
        return hashSet.size() != 1? -1: hashSet.toArray(new Integer[0])[0];
    }
}
