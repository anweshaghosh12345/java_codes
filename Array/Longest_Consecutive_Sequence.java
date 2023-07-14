package Array;

import java.util.*;

public class Longest_Consecutive_Sequence {
    public int longestConsecutive(int[] nums) {
       Set<Integer> set=new HashSet<>();
       for (int num: nums){
           set.add(num);
       }
       int ls=0;
       for(int num:nums){
           if(!set.contains(num-1)){
               int curnum=num;
               int cs=1;
               while (set.contains(curnum +1)){
                   curnum+=1;
                   cs+=1;
               }
               ls=Math.max(ls,cs);
           }
       }
       return ls;
    }
}
