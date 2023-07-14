package Linked_list;


public class Swap_Nodes_in_Pairs {
    public ListNode swapPairs(ListNode head) {
        if(head == null)
            return head;
        ListNode temp =new ListNode(0);
        temp.next=head;
        ListNode cur =temp;
        while (cur.next!=null && cur.next.next != null){
            ListNode first = cur.next;
            ListNode snd= cur.next.next;
            first.next=snd.next;
            cur.next =snd;
            cur.next.next=first;
            cur=cur.next.next;
        }
        return temp.next;
    }
}
