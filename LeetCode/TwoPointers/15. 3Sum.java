import java.util.*;

public class ThreeSum {
    public static void main(String[] args) {
        System.out.println(new ThreeSum().threeSum(new int[]{-1, 0, 1, 2, -1, -4}));
        System.out.println(new ThreeSum().threeSum(new int[]{0, 1, 1}));
        System.out.println(new ThreeSum().threeSum(new int[]{0, 0, 0}));
    }

    public List<List<Integer>> threeSum(int[] nums) {
        int p1, p2;
        Arrays.sort(nums);
        Set<List<Integer>> set = new HashSet<>();
        for (int i = 0; i < nums.length - 2; i++) {
            p1 = i + 1;
            p2 = nums.length-1;
            while (p1 < p2) {
                if (nums[p1] + nums[p2] + nums[i] == 0) {
                    set.add(Arrays.asList(nums[i], nums[p1], nums[p2]));
                    p1++;
                } else if (nums[p1] + nums[p2] + nums[i] < 0) {
                    p1++;
                } else {
                    p2--;
                }
            }
        }
        return new ArrayList<>(set);
    }
}
