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
    private void help(TreeNode root,List<String> res,String s)
    {
        if(root==null) return;
        //sb.append(root.val).append("->");
        if(root.left==null && root.right==null)
        {
             res.add(s+root.val);
        }
        help(root.left,res,s+root.val+"->");
        
        help(root.right,res,s+root.val+"->");
        
    }
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> res= new ArrayList<String>();
        String s="";
        help(root,res,s);
        return res;        
    }
}