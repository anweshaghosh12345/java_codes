package Linked_list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;

public class SortList {
    public ListNode sortList(ListNode head) {
        ListNode cur=head;
        PriorityQueue<ListNode> queue=new PriorityQueue<>((a,b)->(a.val-b.val));

        while (cur!=null){
            queue.add(cur);
            cur=cur.next;
        }
        ListNode listNode=new ListNode();
        ListNode prev=listNode;
        while (!queue.isEmpty()){
            cur=queue.poll();
            cur.next=null;
            prev.next=cur;
            prev=cur;
        }
        return listNode.next;
    }
}
