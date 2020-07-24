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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        Stack<TreeNode> pstack = new Stack<>();
        Stack<TreeNode> qstack = new Stack<>();
        
        if(q == null && p == null){
            return true;
        }else if((q == null && p != null) || (q != null && p == null)){
            return false;
        }
        
        TreeNode pnode = p;
        TreeNode qnode = q;
        qstack.push(q);
        pstack.push(p);
        while(!pstack.isEmpty() && !qstack.isEmpty()){
            if(qstack.size() != pstack.size()){
                return false;
            }
            pnode = pstack.pop();
            qnode = qstack.pop();
            if(qnode.val != pnode.val){
                return false;
            }else{
                if(pnode.left != null && qnode.left != null){
                    pstack.push(pnode.left);
                    qstack.push(qnode.left);
                }else if((qnode.left == null && pnode.left != null) || (qnode.left != null && pnode.left == null)){
                    return false;
                }
                if(pnode.right != null && qnode.right != null){
                    pstack.push(pnode.right);
                    qstack.push(qnode.right);
                }else if((qnode.right == null && pnode.right != null) || (qnode != null && pnode == null)){
                    return false;
                }
            }
        }
        return true;
    }
}
