package Tree;
import java.util.LinkedList;
import java.util.Queue;
import java.io.*;
import java.util.*;

class node extends Node {
    int data;
    node left;
    node right;
    node(int data){
        this.data = data;
        left=null;
        right=null;
    }
}

class GfG {

    static node buildTree(String str){

        if(str.length()==0 || str.charAt(0)=='N'){
            return null;
        }

        String ip[] = str.split(" ");
        // Create the root of the tree
        node root = new node(Integer.parseInt(ip[0]));
        // Push the root to the queue

        Queue<node> queue = new LinkedList<>();

        queue.add(root);
        // Starting from the second element

        int i = 1;
        while(queue.size()>0 && i < ip.length) {

            // Get and remove the front of the queue
            node currNode = queue.peek();
            queue.remove();

            // Get the current node's value from the string
            String currVal = ip[i];

            // If the left child is not null
            if(!currVal.equals("N")) {

                // Create the left child for the current node
                currNode.left = new node(Integer.parseInt(currVal));
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
                currNode.right = new node(Integer.parseInt(currVal));

                // Push it to the queue
                queue.add(currNode.right);
            }
            i++;
        }

        return root;
    }
    static void printInorder(node root)
    {
        if(root == null)
            return;

        printInorder(root.left);
        System.out.print(root.data+" ");

        printInorder(root.right);
    }

    public static void main (String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t=Integer.parseInt(br.readLine());

        while(t > 0){
            String s = br.readLine();
            node root = buildTree(s);
            Left_View_of_Binary_Tree g = new Left_View_of_Binary_Tree();
            ArrayList<Integer> result = g.leftView(root);
            for(int value : result){
                System.out.print(value + " ");
            }
            System.out.println();
            t--;
        }
    }
}
// } Driver Code Ends


//User function Template for Java

/* A Binary Tree node
class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}*/
public class Left_View_of_Binary_Tree {
    ArrayList<Integer> leftView(node n)
    {
        // Your code here
        ArrayList<Integer> ans=new ArrayList<>();
        store(n,0,ans);
        return ans;
    }

    void store(node node,int level,ArrayList<Integer> ans){
        if(node==null)
            return;
        if(level==ans.size())
            ans.add(node.data);
        store(node.left,level+1,ans);
        store(node.right,level+1,ans);
    }
}
