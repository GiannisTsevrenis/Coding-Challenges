class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
        int[] result = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int add =arr[queries[i][0]];
            int j =queries[i][0]+1;
            while (j <=queries[i][1] ) {
                add ^= arr[j];
                j++;
            }

            result[i] = add;
        }
        return result;
    }

}
