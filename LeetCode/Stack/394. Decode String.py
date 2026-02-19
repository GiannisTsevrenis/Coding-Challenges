class Solution:
    def asteroidCollision(self, asteroids: List[int]) -> List[int]:
        stack = []
        for asteroid in asteroids:
            if asteroid > 0:
                stack.append(asteroid)
            else:
                while stack and stack[-1] > 0:
                    if abs(asteroid) > abs(stack[-1]):
                        stack.pop()
                    elif abs(asteroid) < abs(stack[-1]):
                        break
                    else:
                        stack.pop()
                        break
                else:  # comes here when we dont hit a break
                    stack.append(asteroid)
        return stack
