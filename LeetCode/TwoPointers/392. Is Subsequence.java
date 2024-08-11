class Solution {
    public boolean isSubsequence(String s, String t) {
        if (s.isEmpty()) {
            return true;
        }
        if (s.length() > t.length()){
            return false;
        }
        int count = s.length();
        int index = 0;
        char p1 = s.charAt(0);
        for (int i = 0; i < t.length(); i++) {
            if (p1 == t.charAt(i)) {
                index++;
                if (index == count){
                    return true;
                }
                p1 = s.charAt(index);
            }
        }
        return false;
    }
}
