class Solution:
    def uniqueOccurrences(self, arr: List[int]) -> bool:
        uniques = dict()
        for num in arr:
            if num in uniques.keys():
                uniques[num] += 1
            else:
                uniques[num] = 1
        uniques = list(uniques.values())
        return len(uniques) == len(set(uniques)) # no early exit, but sufficient
