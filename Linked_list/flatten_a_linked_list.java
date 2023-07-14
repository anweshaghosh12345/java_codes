package Linked_list;


class node {
 int data;
 node next;
 node child;

 public node(int data) {
 this.data = data;
 this.next = null;
 this.child = null;
 }
 }


public class flatten_a_linked_list {
   public static node Marge(node l1, node l2){
//    node temp=l1;
    node temp=new node(0);
    node res=temp;
    while (l1!=null &&  l2!=null){
           if(l1.data<l2.data){
            temp.child=l1;
            temp=temp.child;
            l1=l1.child;
           }else {
            temp.child=l2;
            temp=temp.child;
            l2=l2.child;
           }
    }
    if(l1!=null)
     temp.child=l1;
    else
     temp.child=l2;

    return res.child;
   }
    public static node flattenLinkedList(node start) {
        //Write your code here
    if(start==null || start.next==null)
     return start;
    start.next=flattenLinkedList(start.next);
    start=Marge(start,start.next);
    return start;
        }
}


