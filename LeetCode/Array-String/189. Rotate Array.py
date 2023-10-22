class Solution:
    def rotate(self, nums: List[int], k: int) -> None:
        l = len(nums)
        if l <=1 or k == 0:
            return nums
        if k > l:
            k = k%l
        cc = 0
        for i in range(l - k, l):
            nums.insert(cc, nums[cc+i])
            cc += 1

        del nums[-k:]
