class Solution {
    public String shortestPalindrome(String s) {
        for (int i = s.length()-1; i >= 0 ; i--) {
            if (isPalindrome(s,0,i)){
                return new StringBuffer(s.substring(i+1)).reverse().append(s).toString();
            }
        }
        return "";
    }
    public static boolean isPalindrome(String s,int left, int right){
        while (right >=left){
            if (s.charAt(left) != s.charAt(right)){
                return false;
            }
            right--;
            left++;
        }
        return true;
    }
}
