package Linked_list;

public class Swap_Kth_nodes_from_ends {
   /* Node swapkthnode(Node head, int n, int k)
    {
        // your code here
        if(head==null)
            return null;
        if(n<k)
            return head;
        Node x=head;
        Node prev_x=null;
        Node y=head;
        Node prev_y=null;
        for (int i = 1; i <k; i++) {
            prev_x=x;
            x=x.next;
        }
        for (int i = 1; i <n-k+1 ; i++) {
            prev_y=y;
            y=y.next;
        }
        if(prev_x!=null){
            prev_x.next=y;
        }
        if(prev_y!=null){
            prev_y.next=x;
        }
        Node temp=x.next;
        x.next=y.next;
        y.next=temp;
        if(k==1)
            head=y;
        if(k==n){
            head=x;
        }
        return head;

    }

    */
}
