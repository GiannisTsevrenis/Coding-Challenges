class Solution {
    public String gcdOfStrings(String str1, String str2) {
        String shorter = str1.length() <= str2.length() ? str1 : str2;
        for (int i = shorter.length(); i > 0; i--) {
            String candidate = shorter.substring(0, i);
            if (dividesBoth(candidate, str1, str2)) {
                return candidate;
            }
        }
        return "";
    }
    
    public boolean dividesBoth(String base, String str1, String str2) {
        if (str1.length() % base.length() != 0 || str2.length() % base.length() != 0) {
            return false;
        }
        int repeat1 = str1.length() / base.length();
        int repeat2 = str2.length() / base.length();
        return base.repeat(repeat1).equals(str1) && base.repeat(repeat2).equals(str2);
    }
}
