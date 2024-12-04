class Solution {
    public boolean canMakeSubsequence(String str1, String str2) {
        int targetLen = str2.length();
        if (targetLen > str1.length()) {
            return false;
        }
        int targetIndex = 0;
        for (int i = 0; i < str1.length(); i++) {
            if ((str2.charAt(targetIndex) - str1.charAt(i) + 26) % 26 <= 1) {
                targetIndex++;
            }
            if (targetIndex == targetLen){
                return true;
            }
            if(targetLen-targetIndex> str1.length()-i){
                return false;
            }
        }
        return false;
    }
}
