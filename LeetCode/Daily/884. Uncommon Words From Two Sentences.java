class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        Map<String, Integer> map = new HashMap<>();
        for (String str : s2.split(" ")) {
                map.merge(str, 1, Integer::sum);
        }
        for (String str : s1.split(" ")) {
                map.merge(str, 1, Integer::sum);
        }
        ArrayList<String> result = new ArrayList<>();
        for (var entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                result.add(entry.getKey());
            }
        }
        return result.toArray(new String[0]);
    }

}
