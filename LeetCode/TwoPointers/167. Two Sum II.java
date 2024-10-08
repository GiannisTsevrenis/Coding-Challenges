public class TwoSumII {
    public int[] twoSum(int[] numbers, int target) {
        int p1 = 0;
        int p2 = numbers.length - 1;
        while (p1 < p2) {
            int sum = numbers[p1] + numbers[p2];
            if (sum == target) {
                return new int[]{p1 + 1, p2 + 1};
            } else if (sum < target) {
                p1++;
            } else {
                p2--;
            }
        }
        return new int[]{0, 1};
    }
}
