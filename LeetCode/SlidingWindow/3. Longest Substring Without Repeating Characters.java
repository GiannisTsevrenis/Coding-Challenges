class Solution {
    public int lengthOfLongestSubstring(String s) {
        int result = Integer.MIN_VALUE;
        int currentWindow = 0;
        int p1 = 0;
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            if (!set.contains(s.charAt(i))) {
                set.add(s.charAt(i));
                currentWindow++;
                result = Math.max(currentWindow, result);
            } else {
                while (s.charAt(p1) != s.charAt(i)) {
                    set.remove(s.charAt(p1));
                    p1++;
                    currentWindow--;
                }
                p1++;
            }
        }
        return result == Integer.MIN_VALUE ? 0 : result;
    }
}
