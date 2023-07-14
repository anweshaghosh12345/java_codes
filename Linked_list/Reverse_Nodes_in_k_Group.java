package Linked_list;

public class Reverse_Nodes_in_k_Group {
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head==null|| head.next!=null)
            return head;
        int c=0;
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode prev=dummy,cur=dummy,nex=dummy;
        while (cur.next!=null){
            cur=cur.next;
            c++;

        }
        while (c>=k){
            cur=prev.next;
            nex=cur.next;
            for (int i = 1; i <k ; i++) {
                cur.next=nex.next;
                nex.next=prev.next;
                prev.next=nex;
                nex=cur.next;
            }
            prev=cur;
            c=c-k;
        }
        return dummy.next;
    }
}
