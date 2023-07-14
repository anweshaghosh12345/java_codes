package Linked_list;

public class Sort_List {
    public ListNode sortList(ListNode head) {
        if(head == null || head.next== null)
            return head;
        ListNode mid=middleNode(head);
        ListNode left=sortList(head);
        ListNode right=sortList(mid);
        return merge(left,right);
    }
    ListNode merge(ListNode list1, ListNode list2){
        ListNode dummyHead = new ListNode();
        ListNode tail = dummyHead;
        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                tail.next = list1;
                list1 = list1.next;
                tail = tail.next;
            } else {
                tail.next = list2;
                list2 = list2.next;
                tail = tail.next;
            }
        }
        tail.next = (list1 != null) ? list1 : list2;
        return dummyHead.next;
    }
    ListNode middleNode(ListNode head) {
        ListNode mid = null;
        while (head != null && head.next != null){
            if(mid == null){
                mid= head;
            }
            else {
                mid=mid.next;
            }
            head=head.next.next;
        }
        ListNode mid2=mid.next;
        return null;
    }
}
