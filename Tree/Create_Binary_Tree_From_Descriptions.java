package Tree;

public class Create_Binary_Tree_From_Descriptions {
    public TreeNode createBinaryTree(int[][] descriptions) {
        TreeNode root=new TreeNode();
        return create(0,descriptions.length-1,descriptions);
    }
    public TreeNode create(int start,int end,int[][]nums){
        if(start>end)
            return null;
        int mid=start+(end-start)/2;
        TreeNode root=new TreeNode(nums[mid][0]);
        if(nums[mid][2]==1) {
            root.left = create(start, mid - 1, nums);
        }
        if(nums[mid][2]==0) {
            root.right = create(mid + 1, end, nums);
        }
        return root;
    }
}
