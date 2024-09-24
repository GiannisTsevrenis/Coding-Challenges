class Solution {
    public int longestCommonPrefix(int[] arr1, int[] arr2) {
        HashSet<String> stringSet = new HashSet<>();
        StringBuilder temp = new StringBuilder();
        int result = 0;
        for (int i : arr1) {
            String str = Integer.toString(i);
            temp.setLength(0);
            for (int j = 0; j < str.length(); j++) {
                temp.append(str.charAt(j));
                stringSet.add(temp.toString());
            }
        }
        for (int i : arr2) {
            String str = Integer.toString(i);
            temp.setLength(0);
            for (int j = 0; j < str.length(); j++) {
                temp.append(str.charAt(j));
                if (stringSet.contains(temp.toString())){
                    result = Math.max(result,temp.length());
                }
            }
        }
        return result;
    }
}
