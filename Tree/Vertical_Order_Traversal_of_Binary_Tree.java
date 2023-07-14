package Tree;
import java.util.*;

class Tuple{
    TreeNode node;
    int row;
    int col;
    public Tuple(TreeNode _node, int _row, int _col){
        node=_node;
        row=_row;
        col=_col;
    }
}

public class Vertical_Order_Traversal_of_Binary_Tree {
    public List<List<Integer>> verticalTraversal(TreeNode root) {

       TreeMap<Integer,TreeMap<Integer,PriorityQueue<Integer>>>
               map=new TreeMap<>();
        Queue<Tuple>q=new LinkedList<Tuple>();
        List<List<Integer>> ans=new ArrayList<>();
        q.offer(new Tuple(root,0,0));
        while (!q.isEmpty()){
            Tuple tuple=q.poll();
            TreeNode node=tuple.node;
            int x=tuple.row;
            int y=tuple.col;
            if(!map.containsKey(x)){
                map.put(x,new TreeMap<>());
            }
            if(!map.get(x).containsKey(y)){
                map.get(x).put(y,new PriorityQueue<>());
            }
            map.get(x).get(y).offer(node.val);

            if(node.left!=null){
                q.offer(new Tuple(node.left,x-1,y+1));
            }
            if(node.right!=null){
                q.offer(new Tuple(node.right,x+1,y+1));
            }
        }
        for(TreeMap<Integer,PriorityQueue<Integer>> ys:map.values()){
            ans.add(new ArrayList<>());
            for (PriorityQueue<Integer> nodes: ys.values()){
                while (!nodes.isEmpty()){
                    ans.get(ans.size()-1).add(nodes.poll());
                }
            }
        }
        return ans;
    }

}
