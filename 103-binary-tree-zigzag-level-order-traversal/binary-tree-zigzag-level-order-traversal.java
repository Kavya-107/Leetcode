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
         List<List<Integer>> res=new ArrayList<>();
        Queue<TreeNode> q=new LinkedList<>();
        if(root==null) return res;
        int ind=0;
        q.offer(root);
        
        while(!q.isEmpty()){
            
            ArrayList<Integer> t=new ArrayList<>();
            int size=q.size();
            for(int i=0;i<size;i++)
            {
                 TreeNode cur = q.poll();
                 t.add(cur.val);
                 if(cur.left != null) q.offer(cur.left);
                 if(cur.right != null) q.offer(cur.right);
            }
            if(ind%2!=0){
                Collections.reverse(t);
    res.add(t);
    }
            else res.add(t);
            ind++;

        } 
        return res;  
        
    }
}