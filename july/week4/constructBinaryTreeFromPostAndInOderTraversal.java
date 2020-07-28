/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        return BuildSubTree(inorder, postorder, 0, inorder.length-1, inorder.length-1);
    }
    
    public TreeNode BuildSubTree(int[] inorder, int[] postorder, int start, int end, int index){
        if(start > end) return null;
        TreeNode root = new TreeNode(postorder[index]);
        int inorderRootIndex = start;
        while(inorder[inorderRootIndex] != postorder[index]) inorderRootIndex++;
        root.right = BuildSubTree(inorder, postorder, inorderRootIndex + 1, end, index - 1);
        root.left = BuildSubTree(inorder, postorder, start, inorderRootIndex - 1, index - (end - inorderRootIndex) - 1);
        return root;
    }
}
