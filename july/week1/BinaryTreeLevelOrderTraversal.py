# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    
    def __init__(self):
        self.res = []
    
    def levelOrderBottom(self, root: TreeNode) -> List[List[int]]:
        h = self.height(root)
        for i in range(1, h+1): 
            self.res.append(self.printGivenLevel(root, i))
            
        self.res.reverse()
        return self.res
        
    def height(self, node):
        if node == None:
            return 0
        
        lheight = self.height(node.left) 
        rheight = self.height(node.right) 
  
        if lheight > rheight : 
            return lheight+1
        else: 
            return rheight+1
        
    def printGivenLevel(self, root , level): 
        if root is None: 
            return []
        if level == 1:
            return [root.val]
        elif level > 1 : 
            return [*self.printGivenLevel(root.left , level-1),
            *self.printGivenLevel(root.right , level-1)]
            
        
