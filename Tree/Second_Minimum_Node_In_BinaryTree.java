package Tree;

import java.util.ArrayList;
import java.util.HashSet;

public class Second_Minimum_Node_In_BinaryTree {
    public int findSecondMinimumValue(TreeNode root) {
        ArrayList<Integer> arr=new ArrayList<>();
        arr=inorder(root,arr);
        HashSet<Integer> set=new HashSet<>();
        for (int i = 0; i < arr.size(); i++) {
            set.add(arr.get(i));
        }
        int min1=root.val;
        long ans=Long.MAX_VALUE;
        for (int v:set) {
            if(min1<v && v<ans)
                ans=v;
        }
        return ans<Long.MAX_VALUE ? (int) ans:-1;
}
    public ArrayList<Integer> inorder(TreeNode root, ArrayList<Integer> arr){
        if(root==null)
            return arr;
        inorder(root.left,arr);
        arr.add(root.val);
        inorder(root.right,arr);
        return arr;
    }
}