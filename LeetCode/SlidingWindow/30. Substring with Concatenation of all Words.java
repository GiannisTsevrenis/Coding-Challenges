class Solution {
   public List<Integer> findSubstring(String s, String[] words) {
        int size = words[0].length();
        int totalSize = words.length * size;
        if (totalSize > s.length()) return List.of();
        
        Map<String, Integer> map = new HashMap<>();
        Map<String, Integer> currentMap = new HashMap<>();
        for (String str : words) {
            map.merge(str, 1, Integer::sum);
        }
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i <= s.length() - totalSize; i++) {
            currentMap.clear();
            for (int j = i; j < i+totalSize; j+=size) {
                currentMap.merge(s.substring(j, j + size), 1, Integer::sum);
            }
            if ( map.equals(currentMap)){
                result.add(i);
            }
        }
        return result;
    }
}
