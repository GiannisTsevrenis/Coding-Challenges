public class ContainerWithMostWater {
    public static void main(String[] args) {
        System.out.println(new ContainerWithMostWater().maxArea(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7}));
    }

    public int maxArea(int[] height) {
        int p1 = 0;
        int p2 = height.length - 1;
        int temp;
        int max = Integer.MIN_VALUE;
        while (p1 < p2) {
            temp = Math.min(height[p1],height[p2]) * (p2 - p1);
            if (temp > max) max = temp;
            if (height[p1] < height[p2]) p1++;
            else p2--;
        }
        return max;
    }
}
