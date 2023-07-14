package Array;
import java.util.*;
public class Find_All_Numbers_Disappeared {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n=nums.length;
        List<Integer> ans=new ArrayList<>();
        Arrays.sort(nums);
        int[] arr=new int[n+1];
        int k=1;
        for (int i = 0; i < n; i++) {
            arr[nums[i]]++;
        }

        for (int i=1;i<arr.length;i++){
            if(arr[i]==0)
                ans.add(i);
        }
        return ans;
    }
}
