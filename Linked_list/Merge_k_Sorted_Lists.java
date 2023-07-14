package Linked_list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Merge_k_Sorted_Lists {
    public ListNode mergeKLists(ListNode[] lists) {
        List<Integer> l = new ArrayList<Integer>();

        for (ListNode ln : lists) {
            while (ln != null) {
                l.add(ln.val);
                ln = ln.next;
            }
        }

        Collections.sort(l);

        ListNode head = new ListNode(0);
        ListNode h = head;
        for (int i=0;i<l.size();i++) {

            h.next = new ListNode(l.get(i));
            h = h.next;
        }
        h.next = null;
        return head.next;
    }
}
