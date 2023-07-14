package Matrix;

public class search_a_2D_Matrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix.length==0)
            return false;
        int rows=matrix.length;
        int cols=matrix[0].length;

        int start=0;
        int end=rows*cols-1;

        while (start<=end){
            int mid=start+(end-start)/2;
            int mid_elmts=matrix[mid/cols][mid%cols];
            if (mid_elmts==target) {
                return true;
            }else if(mid_elmts>target){
                end=mid-1;
            }else if(mid_elmts<target){
                start=mid+1;
            }
        }
        return false;

    }
}
