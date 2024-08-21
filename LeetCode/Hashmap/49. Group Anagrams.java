class Solution {
     public List<List<String>> groupAnagrams(String[] strs) {
        if (strs.length == 1) {
            return List.of(List.of(strs[0]));
        }
        Map<String, List<String>> map = new HashMap<>();
        for (String str : strs) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String newStr = new String(chars);
            if (map.containsKey(newStr)){
                map.get(newStr).add(str);
            }else {
                List<String> tempList = new ArrayList<>();
                tempList.add(str);
                map.put(newStr, tempList);
            }
        }
        return new ArrayList<>(map.values());
    }
}
