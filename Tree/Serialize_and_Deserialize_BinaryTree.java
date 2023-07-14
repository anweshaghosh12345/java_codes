package Tree;

import java.util.LinkedList;
import java.util.Queue;

public class Serialize_and_Deserialize_BinaryTree {
    public String serialize(TreeNode root) {

        if(root==null)
            return "";
        StringBuilder s=new StringBuilder();
        Queue<TreeNode>q=new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()){

            TreeNode temp=q.poll();
            if(temp==null) {
                s.append("n ");
                continue;
            }
            s.append(temp.val+" ");
                q.add(temp.left);
                q.add(temp.right);

        }
        return s.toString();
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if(data=="")
            return null;
        Queue<TreeNode>q=new LinkedList<>();
        String[] value=data.split(" ");
        TreeNode root=new TreeNode(Integer.parseInt(value[0]));
        q.add(root);

        for (int i = 1; i < value.length ; i++) {
            TreeNode parent=q.poll();
            if(!value[i].equals("n")) {
                TreeNode left = new TreeNode(Integer.parseInt(value[i]));
                parent.left=left;
                q.add(left);
            }
            if(! value[++i].equals("n")){
                TreeNode right=new TreeNode(Integer.parseInt(value[i]));
                parent.right=right;
                q.add(right);
            }
        }
        return root;
    }
}
