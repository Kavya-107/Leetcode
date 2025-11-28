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
    List<Integer> op=new ArrayList<>();
    public void inorder(TreeNode root)
    {
        if(root==null) return;
        inorder(root.left);
        op.add(root.val);
        inorder(root.right);        
    }
    public boolean isValidBST(TreeNode root) {
        inorder(root);
        for(int i=1;i<op.size();i++)
        {
            if(op.get(i)<=op.get(i-1)) return false;
        }
        return true;        
    }
}