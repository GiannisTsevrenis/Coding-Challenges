class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int toBePlaced = 0;
        for (int i = 0; i < flowerbed.length; i++) {
            // edge cases
            int left = (i == 0) ? 0 : flowerbed[i - 1];
            int right = (i == flowerbed.length - 1) ? 0 : flowerbed[i + 1];
            if (left + flowerbed[i] + right == 0) {
                flowerbed[i] = 1;
                toBePlaced++;
            }
            if (toBePlaced >= n) {
                return true;
            }
        }
        return false;
    }
}
