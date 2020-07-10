class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        if len(set(nums)) == 1 and len(nums) > 2 and nums[0] == 0:
            return [[0, 0, 0]]
        soln = []
        nums.sort()
        for i in range(len(nums)-2):
            a = nums[i]
            start = i+1
            end = len(nums) - 1
            while start < end:
                b = nums[start]
                c = nums[end]
                if a + b + c == 0:
                    ans = [a, b, c]
                    ans.sort()
                    soln.append(ans)
                    start += 1
                    end -= 1
                elif a + b + c > 0:
                    end -= 1
                else:
                    start += 1
        soln.sort()
        for i in range(len(soln)-2, -1, -1):
            if soln[i][0] == soln[i+1][0] and \
            soln[i][1] == soln[i+1][1] and \
            soln[i][2] == soln[i+1][2]:
                soln.pop(i)
        return soln
