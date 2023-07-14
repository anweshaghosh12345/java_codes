package Linked_list;

public class Delete_Node {
    public void deleteNode(ListNode node) {
        if(node ==null)
            return;
//        while (node.next !=null){
            node.val=node.next.val;
            node.next=node.next.next;
//        }
    }
}
