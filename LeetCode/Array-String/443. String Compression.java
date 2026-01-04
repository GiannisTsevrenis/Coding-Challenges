class Solution {
    public int compress(char[] chars) {
        int writeIndex = 0;
        int i = 0;
        while (i < chars.length) {
            int next = i + 1;
            while ((next < chars.length) && (chars[i] == chars[next])) {
                next++;
            }
            chars[writeIndex] = chars[i];
            writeIndex++;
            int count = next - i;
            if (count > 1) {
                for (char c : String.valueOf(count).toCharArray()) {
                    chars[writeIndex] = c;
                    writeIndex++;
                }
            }
            // next char
            i = next;
        }
        return writeIndex;
    }
}
