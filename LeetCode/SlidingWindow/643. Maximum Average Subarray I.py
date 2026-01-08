class Solution:
    def findMaxAverage(self, nums: List[int], k: int) -> float:
        total = sum(nums[:k])
        current_avg = total
        for i in range(k, len(nums)):
            current_avg = current_avg + nums[i] - nums[i - k]
            total = max(total, current_avg)
        return total / k
