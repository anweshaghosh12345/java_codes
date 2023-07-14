package Linked_list;

public class Reverse_Linked_List {
    public ListNode reverseList(ListNode head) {
        ListNode dummy=null;
        while (head!=null){
            ListNode next=head.next;
            head.next=dummy;
            dummy=head;
            head=next;
        }
        return dummy;
    }
}
