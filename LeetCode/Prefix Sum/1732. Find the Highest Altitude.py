class Solution:
    def largestAltitude(self, gain: List[int]) -> int:
        current = 0
        highest_altitude = 0
        for num in gain:
            current += num
            highest_altitude = max(highest_altitude,current)
        return highest_altitude
