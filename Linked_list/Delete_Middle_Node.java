package Linked_list;

public class Delete_Middle_Node {
    public ListNode deleteMiddle(ListNode head) {
        int c=0;
        ListNode cur=new ListNode();
        ListNode res=new ListNode();
        cur.next=head;
        res=cur;
        while(head!=null){
            head=head.next;
            c++;
        }
        int n=c/2;
        int s=0;
        while(s<n){
            cur=cur.next;
            s++;
        }
        cur.next=cur.next.next;
        return res.next;
    }
}