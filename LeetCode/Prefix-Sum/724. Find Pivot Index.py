class Solution:
    # def pivotIndex(self, nums: List[int]) -> int:
    #     suffix = [0] * len(nums)
    #     suffix[-1] = nums[-1]
    #     for i in range(len(nums) - 2, -1, -1):
    #         suffix[i] = suffix[i + 1] + nums[i]
    #
    #     prefix = [0] * len(nums)
    #     prefix[0] = nums[0]
    #     if prefix[0] == suffix[0]:
    #         return 0
    #     for i in range(1, len(nums)):
    #         prefix[i] = prefix[i - 1] + nums[i]
    #         if prefix[i] == suffix[i]:
    #             return i
    #     return -1
    def pivotIndex(self, nums: List[int]) -> int:
        right_sum = sum(nums)
        left_sum = 0
        for i, number in enumerate(nums):
            if left_sum == right_sum - nums[i]:
                return i
            left_sum += nums[i]
            right_sum -= nums[i]

        return -1
