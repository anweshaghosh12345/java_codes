package Tree;

public class Convert_Sorted_Array_to_BST {
    public TreeNode sortedArrayToBST(int[] nums) {
        return create(0,nums.length-1,nums);
    }

    public TreeNode create(int start, int end, int[]nums){
        if(start>end)
            return null;
        int mid=start+(end-start)/2;
        TreeNode root=new TreeNode(nums[mid]);
        root.left=create(start,mid-1,nums);
        root.right=create(mid+1,end,nums);
        return root;
    }

}
