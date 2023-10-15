class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        d = dict()
        cc =0
        for i in range(0, len(nums)):
            if nums[i] not in d.keys():
                d[nums[i]] = 1
            else:
                d[nums[i]] = 2

        for k,v in d.items():
            for j in range(v):
                nums[cc] = k
                cc+=1
        del nums[cc:]
