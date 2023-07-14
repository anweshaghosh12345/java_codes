package Linked_list;

public class Remove_Nth_Node {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int count=0;
        int scnd=0;
        ListNode node = new ListNode();
        ListNode res= new ListNode();
        node.next=head;
        res.next=head;
       while (head!=null){
           count++;
           head=head.next;
       }
        if (n == count) {
            res.next=res.next.next;
        }
        while (scnd<count-n){
            scnd++;
            node=node.next;

        }
        node.next=node.next.next;

        return res.next;
    }
}
