package Tree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class Node12 {
    int data;
    Node12 left;
    Node12 right;
    Node12(int data){
        this.data = data;
        left=null;
        right=null;
    }
}


class GfC {

    static Node12 buildTree(String str){

        if(str.length()==0 || str.charAt(0)=='N'){
            return null;
        }

        String ip[] = str.split(" ");
        // Create the root of the tree
        Node12 root = new Node12(Integer.parseInt(ip[0]));
        // Push the root to the queue

        Queue<Node12> queue = new LinkedList<>();

        queue.add(root);
        // Starting from the second element

        int i = 1;
        while(queue.size()>0 && i < ip.length) {

            // Get and remove the front of the queue
            Node12 currNode = queue.peek();
            queue.remove();

            // Get the current node's value from the string
            String currVal = ip[i];

            // If the left child is not null
            if(!currVal.equals("N")) {

                // Create the left child for the current node
                currNode.left = new Node12(Integer.parseInt(currVal));
                // Push it to the queue
                queue.add(currNode.left);
            }

            // For the right child
            i++;
            if(i >= ip.length)
                break;

            currVal = ip[i];

            // If the right child is not null
            if(!currVal.equals("N")) {

                // Create the right child for the current node
                currNode.right = new Node12(Integer.parseInt(currVal));

                // Push it to the queue
                queue.add(currNode.right);
            }
            i++;
        }

        return root;
    }
    void inOrder(Node12 node) {
        if (node == null) {
            return;
        }

        inOrder(node.left);
        System.out.print(node.data + " ");

        inOrder(node.right);
    }

    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t=Integer.parseInt(br.readLine());

        while(t-- > 0){
            String s = br.readLine();
            Node12 root = buildTree(s);
            Right_View_of_Binary_Tree tree = new Right_View_of_Binary_Tree();
            ArrayList<Integer> arr = tree.rightView(root);
            for(int x : arr)
                System.out.print(x +" ");
            System.out.println();

        }
    }
}
public class Right_View_of_Binary_Tree {
    ArrayList<Integer> rightView(Node12 node) {
        //add code here.
        ArrayList<Integer> ans=new ArrayList<>();
        store(node,0,ans);
        return ans;
    }
    void store(Node12 node,int level,ArrayList<Integer> ans){
        if(node==null)
            return;
        if(level==ans.size())
            ans.add(node.data);
        store(node.right,level+1,ans);
        store(node.left,level+1,ans);
    }
}
