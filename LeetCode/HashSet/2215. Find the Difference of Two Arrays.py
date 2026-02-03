class Solution:
    def findDifference(self, nums1: List[int], nums2: List[int]) -> List[List[int]]:
        set_a = set(nums1)
        set_b = set(nums2)
        return [list(set_a - set_b), list(set_b - set_a)]
      
        # result = [[], []]
        # set_1 = set(nums1)
        # set_2 = set(nums2)
        # for num in set_1:
        #     if num not in set_2:
        #         result[0].append(num)
        # for num in set_2:
        #     if num not in set_1:
        #         result[1].append(num)
        # return result
