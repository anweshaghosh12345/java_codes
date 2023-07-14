package Linked_list;

public class Remove_Duplicates_II  {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next==null)
            return head;
        ListNode temp= head.next;
        if(temp.val== head.val){
            while (temp != null && temp.val==head.val)
                temp=temp.next;
                return deleteDuplicates(temp);
        }else {
            head.next=deleteDuplicates(temp);
            return head;
        }
    }

}
