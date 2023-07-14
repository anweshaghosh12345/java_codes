package Linked_list;

import Linked_list.ListNode2;

public class Linked_List_Cycle_II {
    public ListNode2 detectCycle(ListNode2 head) {

        if(head ==null || head.next==null)
            return null;
        ListNode2 slw=head;
        ListNode2 fst=head;
        ListNode2 entty=head;
        while(fst.next!=null && fst.next.next!=null){

            slw=slw.next;
            fst=fst.next.next;
            if(slw==fst){


                while(entty!=slw){
                    slw=slw.next;
                    entty=entty.next;
                }
                return entty;

            }
        }
        return null;
    }
}