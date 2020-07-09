class Solution:
    def nthUglyNumber(self, n: int) -> int:
        twos = []
        threes = []
        fives = []
        prev = 1
        for i in range(n-1):
            twos.append(prev*2)
            threes.append(prev*3)
            fives.append(prev*5)
            m = min(twos[0], threes[0], fives[0])
            prev = m
            if m == twos[0]:
                twos.pop(0)
            if m == threes[0]:
                threes.pop(0)
            if m ==  fives[0]:
                fives.pop(0)
        return prev
