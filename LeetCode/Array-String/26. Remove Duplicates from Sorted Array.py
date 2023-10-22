class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        count = 1
        prev = nums[0]
        for i in range(len(nums)):
            if nums[i] != prev:
                nums[count] = nums[i]
                prev = nums[i]
                count += 1
        del nums[count:]
