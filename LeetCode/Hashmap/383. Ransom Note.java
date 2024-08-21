import java.util.HashMap;

public class RansomNote {
    public static void main(String[] args) {
        System.out.println(new RansomNote().canConstruct("a","b"));
        System.out.println(new RansomNote().canConstruct("aa","ab"));
        System.out.println(new RansomNote().canConstruct("aa","aab"));
    }

    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character,Integer> seen = new HashMap<>();
        for (int i = 0; i < magazine.length(); i++) {
            seen.merge(magazine.charAt(i),1,Integer::sum);
        }
        for (int i = 0; i < ransomNote.length(); i++) {
            if (!seen.containsKey(ransomNote.charAt(i))){
                return false;
            }else {
                seen.put(ransomNote.charAt(i),seen.get(ransomNote.charAt(i))-1);
            }
        }
        for (var entry : seen.entrySet()) {
            if (entry.getValue() < 0){
                return false;
            }
        }
        return true;
    }
}
