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
    private void path(TreeNode root,int t,List<List<Integer>> l,ArrayList<Integer> temp,int sum)
    {
        if(root == null) return;
        if(root.left == null && root.right==null)
        {
            sum=sum+root.val;
            temp.add(root.val);
            if(sum == t)
            {
                l.add(new ArrayList<>(temp));
            }
            temp.remove(temp.size()-1);
            return;
        } 
        temp.add(root.val);
        path(root.left,t,l,temp,sum+root.val);
        
        path(root.right,t,l,temp,sum+root.val);
        temp.remove(temp.size()-1);
    }
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> l = new ArrayList<>();
        path(root,targetSum,l,new ArrayList<Integer>(),0);
        return l;
    }
}