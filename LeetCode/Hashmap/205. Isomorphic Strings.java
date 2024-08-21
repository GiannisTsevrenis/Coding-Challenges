import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class IsomorphicStrings {
    public static void main(String[] args) {
        IsomorphicStrings isoStr = new IsomorphicStrings();
        System.out.println(isoStr.isIsomorphic("badc", "baba"));
        System.out.println(isoStr.isIsomorphic("egcd", "adfd"));
        System.out.println(isoStr.isIsomorphic("qwertyuiop[]asdfghjkl;'\\zxcvbnm,./", "',.pyfgcrl/=aoeuidhtns-\\;qjkxbmwvz"));
    }

    public boolean isIsomorphic(String s, String t) {
        Map<Character, Character> map = new HashMap<>();
        Set<Character> seen = new HashSet<>();
        StringBuilder strb = new StringBuilder();
        if (s.length() != t.length()) return false;
        for (int i = 0; i < s.length(); i++) {
            if (!seen.contains(t.charAt(i))) {
                map.putIfAbsent(s.charAt(i), t.charAt(i));
                seen.add(t.charAt(i));
            }
            strb.append(map.get(s.charAt(i)));
        }
        return strb.toString().equals(t);
    }
}
