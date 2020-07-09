class Solution:
    def hammingDistance(self, x: int, y: int) -> int:
        dist = 0
        lx = list(bin(x)[2:])
        ly = list(bin(y)[2:])
        lenDiff = abs(len(lx) - len(ly))
        maxLen = max(len(lx), len(ly))
        if lenDiff > 0:
            if maxLen == len(lx):
                for _ in range(lenDiff):
                    if lx[0] == '1':
                        dist += 1
                    lx.pop(0)
            else:
                for _ in range(lenDiff):
                    if ly[0] == '1':
                        dist += 1
                    ly.pop(0)
        while len(lx) > 0:
            if lx[0] != ly[0]:
                dist += 1
            
            lx.pop(0)
            ly.pop(0)
        
        return dist
            
        
