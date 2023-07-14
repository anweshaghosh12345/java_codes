package Tree;

import java.util.ArrayList;
import java.util.List;

public class N_ary_Tree_Postorder_Traversal {
    public List<Integer> postorder(node root) {
        List<Integer> ans= new ArrayList<>();
        insert(root,ans);
        return ans;
    }
    public void insert(node root, List<Integer> ans){
        if(root != null){
            for (int i = 0; i < root.children.size(); i++) {
                insert(root.children.get(i),ans);
            }
            ans.add(root.val);
        }
    }
}
