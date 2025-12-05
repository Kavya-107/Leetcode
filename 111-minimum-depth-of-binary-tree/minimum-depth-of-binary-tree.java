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
    int min   = Integer.MAX_VALUE;
    private void dfs(TreeNode root,int cur){
        if(root.left == null && root.right == null)
        {
            min=min<cur?min:cur;
            return;
        }
        cur++;
        if(root.left!=null) dfs(root.left,cur);
        if(root.right!=null) dfs(root.right,cur);
    }
    public int minDepth(TreeNode root) {
        if(root == null ) return 0;
        dfs(root,1);
        return min;        
    }
}