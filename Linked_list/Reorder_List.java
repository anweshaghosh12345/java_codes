package Linked_list;

import java.awt.*;

public class Reorder_List {
    public ListNode middle(ListNode head){
        ListNode fast=head;
        ListNode slow=head;
        while (fast!=null && fast.next !=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        return slow;
    }
    public ListNode reverse(ListNode head){
        ListNode prev=null;
        while (head !=null){
            ListNode next=head.next;
            head.next=prev;
            prev=head;
            head=next;
        }
        return prev;
    }
    public void merge(ListNode first,ListNode secnd){
        while (first!=null && secnd !=null){
            ListNode temp=first.next;
            first.next=secnd;
            first=temp;

            temp=secnd.next;
            secnd.next=first;
            secnd=temp;
        }
        if(first!=null)
            first.next=null;
    }
    public void reorderList(ListNode head) {
        if(head==null || head.next ==null)
            return;
        ListNode mid=middle(head);
        ListNode scnd=reverse(mid);
        ListNode first=head;
        merge(first,scnd);
    }
}
