package Linked_list;

public class Delete_Middle_Node_ {
    public ListNode deleteMiddle(ListNode head) {
        if(head==null || head.next==null)
            return null;

        ListNode fast=head.next.next;
        ListNode slow=head;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }

        slow.next=slow.next.next;
        return head;

    }
}
