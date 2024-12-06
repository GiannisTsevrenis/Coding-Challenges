class Solution {
public int maxCount(int[] banned, int n, int maxSum) {
        int currentTotal = 0;
        int occurences = 0;
        HashSet<Integer> hashSet = new HashSet<>();
        for (int i : banned) {
            hashSet.add(i);
        }
        for (int i = 1; i <= n; i++) {
            if (i + currentTotal > maxSum) {
                return occurences;
            } else {
                if (!hashSet.contains(i)) {
                    currentTotal += i;
                    occurences += 1;
                }
            }
        }
        return occurences;
    }
}
// optimized runtime 4ms 
// class Solution {
//     public int maxCount(int[] banned, int n, int maxSum) {
//         int currentTotal = 0;
//         int occurences = 0;
//         boolean[] hashSet = new boolean[10001];
//         for (int i : banned) {
//             hashSet[i] = true;
//         }
//         for (int i = 1; i <= n; i++) {
//             if (i + currentTotal > maxSum) {
//                 return occurences;
//             } else {
//                 if (!hashSet[i]) {
//                     currentTotal += i;
//                     occurences++;
//                 }
//             }
//         }
//         return occurences;
//     }
// }
