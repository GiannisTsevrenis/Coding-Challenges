class Solution {
    public int chalkReplacer(int[] chalk, int k) {
        k = (int) (k % Arrays.stream(chalk).asLongStream().sum());
        if (k == 0) return 0;
        int n = chalk.length;
        int currentStudent = 0;
        while (k > 0) {
            k -= chalk[currentStudent];
            currentStudent = (currentStudent + 1) % n;
        }
        return k == 0 ? currentStudent : (currentStudent - 1 + n) % n;
    }
}
