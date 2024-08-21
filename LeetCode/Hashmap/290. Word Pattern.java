import java.util.*;

public class WordPattern {
    public static void main(String[] args) {
        WordPattern word = new WordPattern();
        System.out.println(word.wordPattern("abba", "dog cat cat dog"));
        System.out.println(word.wordPattern("abba", "dog cat cat fish"));
        System.out.println(word.wordPattern("aaaa", "dog cat cat dog"));
        System.out.println(word.wordPattern("abba", "dog dog dog dog"));
    }

    public boolean wordPattern(String pattern, String s) {
        List<String> str = Arrays.asList(s.split(" "));
        if (pattern.length() != str.size()) return false;
        Map<Character, String> map = new HashMap<>();
        Set<String> seen = new HashSet<>();
        char x;
        String y;
        for (int i = 0; i < pattern.length(); i++) {
            x = pattern.charAt(i);
            y = str.get(i);
            if (map.containsKey(x)) {
                if (!map.get(x).equals(y)) {
                    return false;
                }
            } else if (seen.contains(y)) { // word is already mapped to different key
                return false;
            } else {
                map.put(x, y);
                seen.add(y);
            }
        }
        return true;
    }
}
