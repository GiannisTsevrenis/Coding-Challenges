import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {
    public static void main(String[] args) {
        ValidAnagram obj1 = new ValidAnagram();
        System.out.println(obj1.isAnagram("anagram", "nagaram"));
        System.out.println(obj1.isAnagram("rat", "car"));
    }

    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        Map<Character, Integer> set1 = new HashMap<>();
        Map<Character, Integer> set2 = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            set1.merge(s.charAt(i), 1, Integer::sum);
            set2.merge(t.charAt(i), 1, Integer::sum);
        }
        return set1.equals(set2);
    }
}
