class Solution {
    public String addSpaces(String s, int[] spaces) {
        StringBuilder result = new StringBuilder();
        int cutOff = 0;
        for (int space : spaces) {
            String split = s.substring(cutOff, space);
            result.append(split).append(" ");
            cutOff = space;
        }
        result.append(s.substring(cutOff, s.length()));
        return result.toString();
    }
}
