import java.util.ArrayList;
import java.util.List;

public class MyCalendarTwo {
    List<int[]> singleList;
    List<int[]> doubleList;

    public MyCalendarTwo() {
        this.singleList = new ArrayList<>();
        this.doubleList = new ArrayList<>();
    }

    public boolean book(int start, int end) {
        for (int[] ints : doubleList) {
            if ( Math.max(start,ints[0]) < Math.min(end,ints[1])){
                return false;
            }
        }
        for (int[] ints : singleList) {
            if ( Math.max(start,ints[0]) < Math.min(end,ints[1])){
                doubleList.add(new int[]{Math.max(start,ints[0]),Math.min(end,ints[1])});
            }
        }
        singleList.add(new int[]{start,end});
        return true;
    }
}
