import java.util.Arrays;
import java.util.Collections;

class Solution {
    public int hIndex(int[] citations) {
        Integer[] arr = Arrays.stream(citations).boxed().toArray(Integer[]::new);
        Arrays.sort(arr, Collections.reverseOrder());
        int h =0;
        while (h < arr.length && arr[h] >= h+1) {
            h++;
        }
        return h;
    }
}
