class Solution {
    public String reverseWords(String s) {
        List<String> asd = new ArrayList<>(List.of(s.trim().replaceAll(" +", " ").split(" ")));
        Collections.reverse(asd);
        return String.join(" ",asd);
    }
}
