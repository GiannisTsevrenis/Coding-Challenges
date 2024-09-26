public class MyCalendar {
    List<Pair<Integer,Integer>> calendarList;
    public MyCalendar() {
        this.calendarList = new ArrayList<>();
    }
    public boolean book(int start, int end) {
        //       x1,y1
        Pair<Integer, Integer> newPair = new Pair<>(start, end);
        for (Pair<Integer, Integer> pair : calendarList) {
            if ((newPair.value() > pair.key() && newPair.value() <= pair.value()) || (newPair.key() >= pair.key() && newPair.key() < pair.value()) || (newPair.key()<= pair.key()&& newPair.value()>= pair.value() )) {
                return false;
            }
        }
        calendarList.add(newPair);
        return true;
    }
}

record Pair<K, V>(K key, V value) {}
