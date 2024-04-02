import java.util.*;

class RandomizedSet {
    private Map<Integer, Integer> myMap;
    private List<Integer> myList;
    private Random random;

    public RandomizedSet() {
        this.myMap = new HashMap<>();
        this.myList = new ArrayList<>();
        this.random = new Random();
    }

    public boolean insert(int val) {
        if (myMap.containsKey(val)) {
            return false;
        }
        myMap.put(val, myList.size());
        myList.add(val);
        return true;
    }

    public boolean remove(int val) {
        if (!myMap.containsKey(val)) {
            return false;
        }
        int index = myMap.get(val);
        int lastItem = myList.get(myList.size() - 1);
        myList.set(index, lastItem);
        myMap.put(lastItem, index);
        myList.remove(myList.size() - 1);
        myMap.remove(val);
        return true;
    }

    public int getRandom() {
        return myList.get(random.nextInt(myList.size()));
    }
}
