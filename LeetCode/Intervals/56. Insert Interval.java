import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InsertInterval {
    public static void main(String[] args) {
        InsertInterval InsertInterval = new InsertInterval();
//        System.out.println(Arrays.deepToString(InsertInterval.insert(new int[][]{{1, 3}, {6, 9}}, new int[]{2, 5})));
//        System.out.println(Arrays.deepToString(InsertInterval.insert(new int[][]{{1, 2}, {3, 5}, {6, 7}, {8, 10}, {12, 16}}, new int[]{4, 8})));
        System.out.println(Arrays.deepToString(InsertInterval.insert(new int[][]{{1, 3}, {4, 6}}, new int[]{10, 12})));
    }

    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> intList = new ArrayList<>();
        int i = 0;
        while (i < intervals.length && intervals[i][1] < newInterval[0]) { // add all non-overlaps until newInterval
            intList.add(intervals[i]);
            i++;
        }
        while (i < intervals.length && intervals[i][0] <= newInterval[1]) { // merge all possible overlaps with the insertion
            newInterval[0] = Math.min(newInterval[0], intervals[i][0]);
            newInterval[1] = Math.max(newInterval[1], intervals[i][1]);
            i++;
        }
        intList.add(newInterval);
        while (i < intervals.length) {
            intList.add(intervals[i]);
            i++;
        }
        return intList.toArray(new int[0][]);
    }
}
