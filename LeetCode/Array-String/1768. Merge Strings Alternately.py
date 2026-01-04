class Solution:
    def mergeAlternately(self, word1: str, word2: str) -> str:
        n1, n2 = len(word1), len(word2)
        max_word = max(n1, n2)
        res = []

        for i in range(max_word):
            if i < n1:
                res.append(word1[i])
            if i < n2:
                res.append(word2[i])
        return "".join(res)
