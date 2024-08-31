class Solution {
    public double maxProbability(int n, int[][] edges, double[] succProb, int start_node, int end_node) {
        List<List<Pair<Integer, Double>>> graph = new ArrayList<>(n); // u --> [ v , probabilityU_V]
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }
        for (int i = 0; i < edges.length; i++) {
            int u = edges[i][0];
            int v = edges[i][1];
            double prob = succProb[i];
            graph.get(u).add(new Pair<>(v, prob));
            graph.get(v).add(new Pair<>(u, prob));
        }
        Queue<Pair<Integer, Double>> maxHeap = new PriorityQueue<>((a, b) -> Double.compare(b.value(), a.value()));
        maxHeap.add(new Pair<>(start_node, 1.0));
        HashSet<Integer> seen = new HashSet<>();
        while (!maxHeap.isEmpty()){
            double prob = maxHeap.peek().value(); // retrieve without removing
            int u = maxHeap.poll().key(); // retrieve and remove
            if ( u  == end_node){
                return prob;
            }
            if (seen.contains(u)) {
                continue;
            }
            seen.add(u);
            for (Pair<Integer,Double> vertex: graph.get(u)){
                int nextVertex = vertex.key();
                double nextProb = vertex.value();
                if (seen.contains(nextVertex)) {
                    continue;
                }
                maxHeap.add(new Pair<>(nextVertex,nextProb*prob));
            }
        }
        return 0;
    }

}
record Pair<K, V>(K key, V value) {
}
