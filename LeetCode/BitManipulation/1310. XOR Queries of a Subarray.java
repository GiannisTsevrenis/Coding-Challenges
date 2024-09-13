class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
        int [] prefix = new int[arr.length+1];
        prefix[0] = 0;
        for (int i = 0; i < arr.length; i++) {
            prefix[i+1] = arr[i]^prefix[i];
        }
        int[] result = new  int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            result[i] = prefix[queries[i][1]+1]^prefix[queries[i][0]];
        }
        return result;
    }
}
