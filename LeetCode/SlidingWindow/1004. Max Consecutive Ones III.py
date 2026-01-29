class Solution:
    def longestOnes(self, nums: List[int], k: int) -> int:
        left_pointer = 0
        current_ones = 0
        # rephrasing: find the longest subarray containing at most K zeroes
        # window never shrinks, only expands
        for right_pointer in range(len(nums)):
            if nums[right_pointer] == 0:
                current_ones += 1
            if current_ones > k:
                if nums[left_pointer] == 0:
                    current_ones -= 1
                left_pointer += 1
        return len(nums) - left_pointer
