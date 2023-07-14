package Tree;

import java.util.ArrayList;
import java.util.List;

class Node {
    public int val;
    public List<node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<node> _children) {
        val = _val;
        children = _children;
    }
};

public class N_ary_Tree_Preorder_Traversal {
    public List<Integer> preorder(Node root) {
        List<Integer> ans =new ArrayList<>();
        traversal(root,ans);
        return ans;
    }
    public void traversal(Node root, List<Integer>ans){
        if(root != null) {
            ans.add(root.val);
            for (int i = 0; i < root.children.size(); i++) {
                traversal(root.children.get(i), ans);
            }
        }
    }
}
