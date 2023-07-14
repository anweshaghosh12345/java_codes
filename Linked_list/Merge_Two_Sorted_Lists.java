package Linked_list;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

public class Merge_Two_Sorted_Lists {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1 ==null)
            return  list2;
        if(list2 == null)
            return list1;

            if (list1.val > list2.val) {
               ListNode temp=list1;
               list1=list2;
               list2=temp;
            }
            ListNode res=list1;
            while (list1!=null && list2!=null){
                ListNode temp=null;
                while (list1!=null && list1.val<=list2.val){
                    temp=list1;
                    list1=list1.next;
                }
                temp.next=list2;
                ListNode t=list2;
                list1=list2;
                list2=t;
            }
            return res;
    }
}
/*
ListNode node=new ListNode(0);
        ListNode prev=node;
        ListNode t1=list1;
        ListNode t2=list2;

        while (t1 != null && t2 !=null){
            if(t1.val<t2.val){
                prev.next=t1;

                t1=t1.next;
            }else {
                prev.next=t2;
                t2=t2.next;
            }
            prev=prev.next;
        }
        if(t1 != null)
            prev.next=t1;
        else if(t2 != null)
            prev.next=t2;
        return node.next;
 */
