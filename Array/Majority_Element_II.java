package Array;

import java.util.*;
public class Majority_Element_II {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        int c1 = 0;
        int c2 = 0;
        int el1 = -1;
        int el2 = -1;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (nums[i] == el1)
                c1++;
            else if (nums[i] == el2)
                c2++;
            else if (c1 == 0) {
                el1 = nums[i];
                c1=1;
            }
            else if (c2 == 0) {
                el2 = nums[i];
                c2=1;
            } else {
                c1--;
                c2--;
            }
        }
        int cnt1 = 0, cnt2 = 0;
        for (int i = 0; i < n; i++)
            {
                if (nums[i] == el1)
                    cnt1++;
                else if (nums[i] == el2)
                    cnt2++;
            }
            if (cnt1 > n / 3)
                ans.add(el1);
            if (cnt2 > n / 3)
                ans.add(el2);

            return ans;
    }
}

