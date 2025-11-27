/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        StringBuilder sb=new StringBuilder();
        sb.append("[");
        hs(root,sb);
        sb.append("]");
        return sb.toString();      
    }

    private void hs(TreeNode root,StringBuilder sb)
    {
        if(root==null)
        {
            sb.append("null,");
            return;
        }
        sb.append(Integer.toString(root.val)).append(",");
        hs(root.left,sb);
        hs(root.right,sb);
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        StringBuilder sb=new StringBuilder(data);
        sb.deleteCharAt(0);
        sb.deleteCharAt(sb.length()-1);
        String arr[]=sb.toString().split(",");
        List<String> l=new LinkedList<>(Arrays.asList(arr));
        return hd(l);
    }

    private TreeNode hd(List<String> l)
    {
        if(l.get(0).equals("null")){
            l.remove(0);
            return null;
        }

        TreeNode root=new TreeNode(Integer.parseInt(l.get(0)));
        l.remove(0);
        root.left=hd(l);
        root.right=hd(l);
        return root;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));