class Solution:
    def isSubsequence(self, s: str, t: str) -> bool:
        if len(s) == 0:
            return True
        current = 0
        lenght = len(s)
        for ch in t:
            if s[current] == ch:
                current += 1
            if current == lenght:
                return True
        return lenght == current
