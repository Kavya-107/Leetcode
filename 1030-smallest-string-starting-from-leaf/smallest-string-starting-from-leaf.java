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
    String min="{";
    private String help(TreeNode root,StringBuilder sb)
    {
        if(root==null) return min;
        sb.append((char)('a' + root.val));

        if(root.left==null && root.right==null){       
        String t=new StringBuilder(sb).reverse().toString();
        if(min.compareTo(t)>0)
        {
                min=t;
        }
        }
        
        help(root.left,sb);
       // sb.deleteCharAt(sb.length()-1);
        help(root.right,sb);
        sb.deleteCharAt(sb.length()-1);

        return min;
    }


    public String smallestFromLeaf(TreeNode root) {
        StringBuilder sb=new StringBuilder();
        help(root,sb);
        return min;        
    }
}