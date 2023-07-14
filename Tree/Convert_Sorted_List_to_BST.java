package Tree;

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class Convert_Sorted_List_to_BST {
    public TreeNode sortedListToBST(ListNode head) {
       if(head==null)
           return null;
        return create(head,null);
    }
    public TreeNode create(ListNode head, ListNode tail){
        ListNode slow=head;
        ListNode fast=head;
        if(head==tail)
            return  null;
        while (fast!=tail && fast.next!=tail){
            fast=fast.next.next;
            slow=slow.next;
        }
        TreeNode node=new TreeNode(slow.val);
        node.left=create(head,slow);
        node.right=create(slow.next,tail);
        return node;
    }
}
