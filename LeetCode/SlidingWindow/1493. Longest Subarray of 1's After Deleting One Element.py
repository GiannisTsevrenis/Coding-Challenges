class Solution:
    def longestSubarray(self, nums: List[int]) -> int:
        left = 0
        current_zeroes = 0
        max_length = 0
        current_length = 0
        for i in range(len(nums)):
            if nums[i] == 0:
                current_zeroes += 1
            current_length += 1
            while current_zeroes > 1:
                if nums[left] == 0:
                    current_zeroes -= 1
                left += 1
                current_length -= 1
            max_length = max(max_length, current_length)
        return max_length - 1
