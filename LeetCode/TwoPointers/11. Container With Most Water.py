class Solution:
    def maxArea(self, height: List[int]) -> int:
        # area = width * height
        # height = min ( height[left], height[right])
        left = 0
        right = len(height) - 1
        max_area = float('-inf')
        while left < right:
            temp = (right - left) * min(height[left], height[right])
            if temp > max_area:
                max_area = temp
            if height[left] < height[right]:
                left += 1
            else:
                right -= 1
        return max_area
