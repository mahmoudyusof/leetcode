class Solution:
    def islandPerimeter(self, grid: List[List[int]]) -> int:
        ans = 0
        for i, row in enumerate(grid):
            for j, n in enumerate(row):
                if n == 1:
                    if j+1 == len(row) or grid[i][j+1] == 0:
                        ans += 1

                    if i+1 == len(grid) or grid[i+1][j] == 0:
                        ans += 1
                    
                    if j-1 < 0 or grid[i][j-1] == 0:
                        ans += 1

                    if i-1 < 0 or grid[i-1][j] == 0:
                        ans += 1
                else:
                    continue
        return ans
