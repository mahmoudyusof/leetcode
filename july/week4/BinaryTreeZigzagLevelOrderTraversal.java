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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        if(root == null) return res;
        Queue<TreeNode> q = new LinkedList<>();
        TreeNode current;
        q.add(root);
        while(q.size() != 0){
            List<Integer> level = new ArrayList<>();
            int s = q.size();
            for(int i=0; i<s; i++){
                current = q.remove();
                level.add(current.val);
                if(current.right != null){
                    q.add(current.right);
                }
                if(current.left != null){
                    q.add(current.left);
                }
            }
            res.add(level);
        }
        for(int i=0; i<res.size(); i+=2){
            Collections.reverse(res.get(i));
        }
        return res;
    }
}
