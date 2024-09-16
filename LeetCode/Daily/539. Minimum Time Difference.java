class Solution {
    public int findMinDifference(List<String> timePoints) {
         if (timePoints.size()>24*60){
            return 0;
        }
        Set<Integer> set = new HashSet<>();
        List<Integer> timeInMinutes = new ArrayList<>();
        for (String timePoint : timePoints) {
            String[] split = timePoint.split(":");
            int minutes = Integer.parseInt(split[0]) * 60 + Integer.parseInt(split[1]);
            if (set.contains(minutes)) {
                return 0;
            } else {
                set.add(minutes);
            }
            timeInMinutes.add(minutes);
        }
        timeInMinutes.sort(null);
        timeInMinutes.add(timeInMinutes.get(0) + 24 * 60);
        int minDifference = 12 * 60;
        for (int i = 1; i < timeInMinutes.size(); i++) {
            int difference = timeInMinutes.get(i) - timeInMinutes.get(i - 1);
            minDifference = Math.min(minDifference, difference);
        }
        return minDifference;
    }
}
