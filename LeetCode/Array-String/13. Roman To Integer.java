class Solution {
    public int romanToInt(String s) {
        Map<Character, Integer> order = new HashMap<>(Map.of('M', 1000,
                'D', 500, 'C', 100, 'L', 50, 'X', 10, 'V', 5, 'I', 1));
        int sum = 0;
        int len = s.length();
        for (int i = 0; i < len - 1; i++) {
            if (order.get(s.charAt(i)) >= order.get(s.charAt(i + 1))) {
                sum += order.get(s.charAt(i));
            } else {
                sum -= order.get(s.charAt(i));
            }
        }
        sum += order.get(s.charAt(len - 1));
        System.out.println(sum);
        return sum;
    }
}
