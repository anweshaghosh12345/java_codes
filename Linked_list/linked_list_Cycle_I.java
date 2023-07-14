package Linked_list;

class ListNode2 {
      int val;
     ListNode2 next;
      ListNode2(int x) {
         val = x;
          next = null;
      }
  }

public class linked_list_Cycle_I {
    public boolean hasCycle(ListNode2 head) {

        if(head==null)
            return false;
        ListNode2 before =head;
        ListNode2 after =head;

        while (after!=null && after.next !=null){
            before=before.next;
            after=after.next.next;
            if(before==after)
                return true;
        }
        return false;
    }
}
