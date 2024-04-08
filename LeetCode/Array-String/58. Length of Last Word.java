class Solution {
    public int lengthOfLastWord(String s) {
        List<String> asd = List.of(s.trim().replaceAll(" +"," ").split(" "));
        System.out.println(asd);
        return asd.get(asd.size()-1).length();
    }
}
