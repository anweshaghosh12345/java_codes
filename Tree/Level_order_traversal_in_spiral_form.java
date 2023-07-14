package Tree;

import java.util.*;

class Node_s
{
    int data;
    Node_s left, right;

    Node_s(int item)
    {
        data = item;
        left = right = null;
    }
}

public class Level_order_traversal_in_spiral_form {
    ArrayList<Integer> findSpiral(Node_s root) {
        // Your code here
        ArrayList<Integer> ans = new ArrayList<>();
        if (root == null)
            return ans;
        Queue<Node_s> q = new LinkedList<>();
        q.add(root);
        int flag = 0;
        while (!q.isEmpty()) {
            int size = q.size();
            List<Integer> level = new ArrayList<Integer>(size);
            for (int i = 0; i < size; i++) {
                Node_s temp = q.poll();
                level.add(temp.data);
                if (temp.left != null)
                    q.offer(temp.left);
                if (temp.right != null)
                    q.offer(temp.right);
            }
            if (flag == 0) {
                Collections.reverse(level);
                flag = 1;
            } else {
                flag = 0;
            }
            for (int n:level){
                ans.add(n);
            }
        }
        return ans;
    }
}