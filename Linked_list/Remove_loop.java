package Linked_list;

public class Remove_loop {
    /*
    public static void removeLoop(Node head){
        // code here
        // remove the loop without losing any nodes
        Node slow=head;
        Node fast=head;
        Node l=head;
        if(head==null)
            return;
        while (fast!=null && fast.next!=null){
            l=slow;
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                break;
            }
        }
        if(fast==slow){
            fast=head;
            while (fast!=slow)
            {
                l=slow;
                slow=slow.next;
                fast=fast.next;
            }
            l.next=null;
        }
    }

     */
}
