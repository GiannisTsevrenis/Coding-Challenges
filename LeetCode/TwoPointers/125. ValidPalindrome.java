public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String s1 = ( s.length()% 2 != 0) ? s.substring(s.length()/2+1): s.substring(s.length()/2);
        return new StringBuilder(s1).reverse().toString().equals(s.substring(0, s.length() / 2));
    }
}
