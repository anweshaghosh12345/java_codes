package Linked_list;

public class Palindrome_Linked_List {
    public ListNode reverse(ListNode slow){
        ListNode prev =null;
        ListNode nxt=null;
        while (slow!=null){
             nxt=slow.next;
            slow.next=prev;
            prev=slow;
            slow=nxt;
        }
        return prev;
    }
    public boolean isPalindrome(ListNode head) {
        if(head==null|| head.next==null)
            return true;

        ListNode slow=head;
        ListNode fast=head;
        while (fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        slow.next=reverse(slow.next);
        slow=slow.next;
        ListNode dummy=head;
        while (slow!=null){
            if(dummy.val!=slow.val)
                return false;
            dummy=dummy.next;
            slow=slow.next;
        }
        return true;
    }
}
/*
int count=0;
        ListNode cur=head;
        while (cur!=null){
            count++;
            cur=cur.next;
        }
        int[] ar=new int[count];
        for (int i = 0; i < count; i++) {
            ar[i]=head.val;
            head=head.next;
        }
        for (int i = 0; i < count/2; i++) {
            if(ar[i]!=ar[count-i-1])
                return false;
        }
        return true;
 */