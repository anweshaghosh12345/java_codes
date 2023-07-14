package Linked_list;

public class Intersection_of_Two_Linked_Lists {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA==null || headB ==null)
            return null;
        ListNode d1=headA;
        ListNode d2=headB;
        while (d1!=d2){

            if (d1!=null){
                d1=d1.next;
            }
            else {
                d1 = headB;
            }
            if (d2!=null){
                d2=d2.next;
            }else {
                d2 = headA;
            }
        }
        return d1;
    }
}
/*
  while (headB!=null){
 *           ListNode temp=headA;
 *           while (temp!=null){
 *               if(temp==headB)
 *                   return headB;
 *               temp=temp.next;
 *           }
 *            headB=headB.next;
 *         }
 *         return null;
 */

/*
static int difference(ListNode d1, ListNode d2){
        int l1=0;

        int l2=0;
        while (d1!=null){
            ++l1;
            d1=d1.next;
        }
        while (d2!=null){
            ++l2;
            d2=d2.next;
        }

        return l1-l2;
    }
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {


        int dif=difference(headA,headB);

         if(dif<0){
            while (dif++!=0){
                headB=headB.next;
            }
        }
        else  {
            while (dif-- !=0){
                headA=headA.next;
            }
        }
        while (headA!=null ){
            if(headA==headB)
                return headA;
            headA=headA.next;
            headB=headB.next;
        }
        return headA;
    }
}
 */
/*
ListNode d1=headA;
        int l1=0;
        ListNode d2=headB;
        int l2=0;
        while (d1!=null){
            l1++;
            d1=d1.next;
        }
        while (d2!=null){
            l2++;
            d2=d2.next;
        }
        d1=headA;
        d2=headB;
        int dif=l1-l2;
        if(dif<0){
            while (dif++!=0){
                d2=d2.next;
            }
        }
        else  {
            while (dif-- !=0){
                d1=d1.next;
            }
        }
        while (d1!=null && d2!=null){
            if(d1==d2)
                return d2;
            d1=d1.next;
            d2=d2.next;
        }
        return d1;
 */