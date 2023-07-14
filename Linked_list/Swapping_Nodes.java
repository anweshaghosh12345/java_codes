package Linked_list;

public class Swapping_Nodes {
    public ListNode swapNodes(ListNode head, int k) {
        int c=0;
        ListNode cur=head;
        ListNode temp1=new ListNode();
        temp1.next=head;
        ListNode temp2=new ListNode();
        temp2.next=head;
        while (head!=null){
            c++;
            head=head.next;
        }
        for (int i = 0; i < k; i++) {
            temp1=temp1.next;
        }
        for (int i = 0; i < c-k+1; i++) {
            temp2=temp2.next;
        }
        int v=temp1.val;
        temp1.val=temp2.val;
        temp2.val=v;
        return cur;
    }
}