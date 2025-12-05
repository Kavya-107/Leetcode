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
    public boolean isCousins(TreeNode root, int x, int y) {
        if(root.val == x || root.val == y){
            return false;
        }
        int[] xVal =new int[2]; //{depth , parent}
        int[] yVal = new int[2];
        xVal[0]=-1;
        yVal[0]=-1;
        Queue<TreeNode> q=new LinkedList<>();
        q.offer(root);
        int depth = 0;
        while(!q.isEmpty()){
            
            int size = q.size();
            for(int i=0;i<size;i++)
            {
                TreeNode t =q.poll();
                if((t.left!=null && t.left.val == x) || (t.right!=null && t.right.val == x)){
                    xVal[0]=depth+1;
                    xVal[1]=t.val;
                }

                if((t.left!=null && t.left.val == y) || (t.right!=null && t.right.val == y)){
                    yVal[0]=depth+1;
                    yVal[1]=t.val;
                }

                if(xVal[0]!=-1 && yVal[0]!=-1){
                    if(xVal[0]==yVal[0] && xVal[1]!=yVal[1]){
                        return true;
                    }
                    return false;
                }
                if(t.left!=null) q.offer(t.left);
                if(t.right!=null) q.offer(t.right);
            }
            depth++;


        }
        if(xVal[0]==yVal[0] && xVal[1]!=yVal[1]){
                        return true;
        }
     return false;       
    }
}