class Solution {
    public String largestNumber(int[] nums) {
        List<String> numbers = new ArrayList<>();
        for (int num : nums) {
            numbers.add(Integer.toString(num));
        }
        numbers.sort((a,b)-> (b+a).compareTo(a+b));
         if( numbers.get(0).equals("0")){
            return "0";
        }
        return String.join("", numbers);
    }
}
