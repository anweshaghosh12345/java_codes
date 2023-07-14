package Linked_list;

import java.util.ArrayList;
import java.util.Collections;

public class Swapping_Nodes_in_LinkedList {
    public ListNode swapNodes(ListNode head, int k) {


        ListNode fast=head;
        ListNode slow=head;
        ListNode first,second;
        for (int i = 0; i < k-1; i++) {
            fast=fast.next;
        }
        first=fast;

        while (fast.next !=null){
            slow=slow.next;
            fast=fast.next;
        }
        second=slow;
        int temp=first.val;
        first.val=second.val;
        second.val=temp;


        return head;
    }

}