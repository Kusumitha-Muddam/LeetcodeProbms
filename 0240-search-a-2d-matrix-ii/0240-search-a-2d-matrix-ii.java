class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
         int c=matrix[0].length;
         for(int i=0;i<matrix.length;i++){
            //int j=0;
        int low=0,high=matrix[0].length-1;
        while(low<=high)
        {
            int m=(low+high)/2;
            if(matrix[i][m]==target)
            return true;
            else if(matrix[i][m]<target)
            low=m+1;
            else
            high=m-1;
        }
         }
        return false;
    }
}