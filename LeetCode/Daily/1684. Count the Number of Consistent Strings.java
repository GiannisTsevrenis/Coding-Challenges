class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int consistentStrings = 0;
        HashSet<Character> set = new HashSet<>();
        for (char c : allowed.toCharArray()) {
            set.add(c);
        }
        for (String word : words) {
            boolean include = true;
            for (char c : word.toCharArray()) {
                if (!set.contains(c)) {
                    include = false;
                    break;
                }
            }
            if (include) {
                consistentStrings++;
            }
        }
        return consistentStrings;
    }
}
