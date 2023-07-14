package Linked_list;

class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) {
          this.val = val;
      }
      ListNode(int val, ListNode next)
      {
          this.val = val;
          this.next = next;
      }
  }
public class Remove_Duplicates {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode curr =head;
        while (curr != null) {
            ListNode temp=curr;
            while (temp!=null && curr.val==temp.val){
                temp=temp.next;
            }
            curr.next=temp;
            curr=curr.next;
        }
        return head;
    }
}
