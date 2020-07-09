class Solution:
    def arrangeCoins(self, n: int) -> int:
        res = 0
        while n > 0:
            n -= res+1
            if n >= 0: res += 1
        
        return res
