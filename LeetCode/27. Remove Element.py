class Solution:
    def removeElement(self, nums: list[int], val: int) -> int:
        k, z = 0, len(nums)
        for i in nums[::-1]:
            if i == val:
                k += 1
                nums.remove(i)
        return z - k
