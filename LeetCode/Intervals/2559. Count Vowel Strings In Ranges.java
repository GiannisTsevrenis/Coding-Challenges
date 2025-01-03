public int[] vowelStrings(String[] words, int[][] queries) {
    int[] result = new int[queries.length];
    ArrayList<Integer> integers = new ArrayList<>();
    int total = 0;
    integers.add(0);
    HashSet<Character> set = new HashSet<>(List.of('a', 'e', 'i', 'o', 'u'));
    for (String word : words) {
        if (set.contains(word.charAt(0)) && set.contains(word.charAt(word.length() - 1))) {
            integers.add(++total);
        } else {
            integers.add(total);
        }
    }
    for (int i = 0; i < queries.length; i++) {
        result[i] = integers.get(queries[i][1] + 1) - integers.get(queries[i][0]);
    }
    return result;
}
