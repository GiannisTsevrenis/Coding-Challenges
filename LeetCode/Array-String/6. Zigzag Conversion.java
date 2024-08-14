import java.util.ArrayList;
import java.util.List;

public class ZigzagConversion {
    public static void main(String[] args) {
        System.out.println(new ZigzagConversion().convert("PAYPALISHIRING", 3));
        System.out.println(new ZigzagConversion().convert("PAYPALISHIRING", 4));
        System.out.println(new ZigzagConversion().convert("AB", 1));
    }

    public String convert(String s, int numRows) {
        List<List<Character>> list = new ArrayList<>(numRows);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < numRows; i++) {
            list.add(new ArrayList<>());
        }
        int depth = 0;
        int direction = numRows == 1 ? 0 : -1;
        for (int i = 0; i < s.length(); i++) {
            list.get(depth).add(s.charAt(i));
            if (depth == 0 || depth == numRows - 1) {
                direction *= -1;
            }
            depth += direction;
        }
        for (List<Character> item : list)
            for (char c : item)
                sb.append(c);
        return sb.toString();
    }
}
