package Tree;


// Definition for a Node.
class Node1 {
    public int val;
    public Node1 left;
    public Node1 right;
    public Node1 next;

    public Node1() {}

    public Node1(int _val) {
        val = _val;
    }

    public Node1(int _val, Node1 _left, Node1 _right, Node1 _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};


public class Populating_Next_Right_Pointers {
    public Node1 connect(Node1 root) {
        if(root==null)
            return root;
        Node1 leftNode=root;
        while (leftNode.left!=null){
            Node1 head=leftNode;
            while (head!=null){
                head.left.next=head.right;
                if(head.next!=null){
                   head.right.next=head.next.left;
                }
                head=head.next;
            }
            leftNode=leftNode.left;
        }


        return root;
    }
}



























/*
if(root == null)
            return root;
        Node1 leftNode =root;
        while (leftNode.left!=null){
            Node1 head=leftNode;
            while (head!=null){
                head.left.next=head.right;
                if(head.next != null){
                    head.right.next=head.next.left;
                }
                head=head.next;
            }
            leftNode=leftNode.left;
        }
        return root;
 */