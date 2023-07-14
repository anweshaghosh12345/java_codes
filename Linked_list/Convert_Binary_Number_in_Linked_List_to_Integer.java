package Linked_list;

public class Convert_Binary_Number_in_Linked_List_to_Integer {
    public int getDecimalValue(ListNode head) {
        if(head==null)
            return  0;
        String s="";
        ListNode d=head;
        while (d!=null){
            s+=d.val;
            d=d.next;
        }
        int dec=Integer.parseInt(s,2);
        return dec;
    }
}
