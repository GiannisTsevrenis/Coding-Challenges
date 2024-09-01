class Solution {
    public int[][] merge(int[][] intervals) {

        Arrays.sort(intervals, (x, y) -> {
            if (x[0] == y[0]) {
                return x[1] - y[1]; // asc
            } else {
                return x[0] - y[0]; // asc
            }
        });
        List<int[]> intList = new ArrayList<>();
        intList.add(intervals[0]);
        for (int[] interval : intervals) {
            int start = interval[0];
            int end = interval[1];
            int[] lastMerged = intList.get(intList.size() - 1);
            if (lastMerged[1] < start) { // no overlap
                intList.add(interval);
            } else {
                lastMerged[1] = Math.max(lastMerged[1], end);
            }
        }

        return intList.toArray(new int[0][]);
    }
}
