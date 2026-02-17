class Solution:
    def equalPairs(self, grid: List[List[int]]) -> int:
        n = len(grid)
        frequencies = dict()
        pairs = 0
        for i in range(n):
            # tuples as key
            row_tuple = tuple(grid[i])
            frequencies[row_tuple] = frequencies.get(row_tuple, 0) + 1

        # column
        for j in range(n):
            col_tuple = tuple(grid[i][j] for i in range(n))
            pairs += frequencies.get(col_tuple, 0)
        return pairs
