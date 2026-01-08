class Solution:
    def maxOperations(self, nums: List[int], k: int) -> int:
        frequency_map = {}
        total_operations = 0
        for number in nums:
            target = k - number
            if target in frequency_map.keys():
                total_operations += 1
                frequency_map[target] -= 1
                if frequency_map[target] <= 0:
                    del frequency_map[target]
            else:
                frequency_map[number] = frequency_map.get(number, 0) + 1
        return total_operations
