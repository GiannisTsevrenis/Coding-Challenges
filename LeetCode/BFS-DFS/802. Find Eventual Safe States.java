class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        List<Integer> result = new ArrayList<>();
        HashMap<Integer, Boolean> safeNodes = new HashMap<>();
        for (int i = 0; i < graph.length; i++) { // for each node
            if (dfs(i, graph, safeNodes)) {
                result.add(i);
            }
        }
        return result;
    }

    private boolean dfs(int i, int[][] graph, HashMap<Integer, Boolean> safeNodes) {
        if (safeNodes.containsKey(i)) {
            return safeNodes.get(i);
        }
        safeNodes.put(i, false);
        for (int j : graph[i]) {
            if (!dfs(j, graph, safeNodes)) {
                return false;
            }
        }
        // this is a safe node
        safeNodes.put(i, true);
        return true;
    }
}
