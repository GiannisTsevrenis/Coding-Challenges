import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ContainsDuplicate {
    public static void main(String[] args) {
        ContainsDuplicate containsDuplicate = new ContainsDuplicate();
        System.out.println(containsDuplicate.containsNearbyDuplicate(new int[]{1, 2, 3, 1}, 3));
        System.out.println(containsDuplicate.containsNearbyDuplicate(new int[]{1, 0, 1, 1}, 1));
        System.out.println(containsDuplicate.containsNearbyDuplicate(new int[]{1, 2, 3, 1, 2, 3}, 2));
    }

    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(nums[i])) {
                map.put(nums[i], new ArrayList<>(List.of(i)));
            } else {
                for (Integer item : map.get(nums[i])) {
                    if (Math.abs(i -item) <= k){
                        return true;
                    }
                }
                map.get(nums[i]).add(i);
            }
        }
        return false;
    }
}
