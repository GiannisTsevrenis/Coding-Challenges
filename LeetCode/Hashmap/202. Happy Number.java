import java.util.HashSet;
import java.util.Set;

public class HappyNumber {
    public static void main(String[] args) {
        HappyNumber happyObj = new HappyNumber();
        System.out.println(happyObj.isHappy(2));
    }

    public boolean isHappy(int n) {
        String strX;
        Set<Integer> set = new HashSet<>();
        while (!set.contains(n) && n != 1) {
            set.add(n);
            strX = String.valueOf(n);
            n = 0;
            for (char ch : strX.toCharArray()) {
                n += Math.pow(ch - '0', 2);
            }
        }
        return n == 1;
    }
}
