class Solution {
    public int getLucky(String s, int k) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            int a = s.charAt(i) - 'a' + 1;
            stringBuilder.append(a);
        }
        while (k-- > 0){
            stringBuilder = transform(stringBuilder);

        }
        return Integer.parseInt(String.valueOf(stringBuilder));
    }

    public static StringBuilder transform(StringBuilder s) {
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            sum += s.charAt(i) - '0';
        }
        return new StringBuilder().append(sum);
    }
}
