class Solution {
    public int minExtraChar(String s, String[] dictionary) {
        Set<String> wordSet = new HashSet<>(Arrays.asList(dictionary));
        int n = s.length();
        int[] min = new int[n + 1];
        min[0] = 0;
        for (int i = 1; i <= n; i++) {
            min[i] = min[i - 1] + 1;
            for (int j = 0; j < i; j++) {
                if (wordSet.contains(s.substring(j, i))) {
                    min[i] = Math.min(min[i], min[j]);
                }
            }
        }
        return min[n];
    }
}
