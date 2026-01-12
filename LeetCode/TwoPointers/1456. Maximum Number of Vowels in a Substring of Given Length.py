class Solution:
    def maxVowels(self, s: str, k: int) -> int:
        vowels = {'a', 'e', 'i', 'o', 'u'}
        right_pointer = 0
        current_sum = 0
        for i in range(k):
            if s[i] in vowels:
                current_sum += 1
            right_pointer += 1
        max_sum = current_sum
        for i in range(len(s) - k):
            if s[i] in vowels:
                current_sum -= 1
            if s[i + k] in vowels:
                current_sum += 1
            max_sum = max(max_sum, current_sum)
        return  (max_sum)
