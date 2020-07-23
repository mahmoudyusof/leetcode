import itertools
class Solution:
    def subsets(self, nums: List[int]) -> List[List[int]]:
        ans = []
        for i in range(len(nums)+1):
            combs = itertools.combinations(nums, i)
            for c in combs:
                ans.append(list(c))
        
        return ans
