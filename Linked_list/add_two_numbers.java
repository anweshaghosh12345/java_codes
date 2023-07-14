package Linked_list;

public class add_two_numbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode l3=new ListNode(0);
        ListNode cur_node=l3;

        int carry =0;

        while (l1 != null || l2 !=null ) {
            int sum=0;
            if(l1!=null) {
                sum+=l1.val;
                l1 = l1.next;
            }
            if(l2!=null) {
                sum+=l2.val;
                l2 = l2.next;
            }
            sum+=carry;
            carry=sum/10;
            cur_node.next=new ListNode(sum%10);
            cur_node=cur_node.next;

        }
        if(carry>0)
            cur_node.next=new ListNode(carry);
        return l3.next;
    }
}
