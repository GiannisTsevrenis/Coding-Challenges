class Solution {
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        Map<Character, Character> map = new HashMap<>() {{
            put(')', '(');
            put('}', '{');
            put(']', '[');
        }};
        for (int i = 0; i < s.length(); i++) {
            if (!map.containsKey(s.charAt(i))) {
                stack.push(s.charAt(i));
            }else if (stack.isEmpty()){
                return false;
            }else if (stack.peek() != map.get(s.charAt(i))) {
                return false;
            }else {
                stack.pop();
            }
        }
        return stack.isEmpty();
    }
}
