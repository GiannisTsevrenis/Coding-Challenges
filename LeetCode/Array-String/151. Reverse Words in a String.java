class Solution {
    public String reverseWords(String s) {
        List<String> asd = new ArrayList<>(List.of(s.trim().replaceAll(" +", " ").split(" ")));
        Collections.reverse(asd);
        return String.join(" ",asd);
    }
    //
    //    public String reverseWords(String s) {
    //     String[] words = s.trim().replaceAll(" +", " ").split(" ");
    //     for (int i = 0; i < words.length/2; i++) {
    //         String temp = words[i];
    //         words[i] = words[words.length - 1 - i];
    //         words[words.length - 1 - i] = temp;
    //     }
    //     return String.join(" ", words);
    // }
}
