class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
         int f=0;
         
         int l= matrix.length;
         int h = matrix[0].length;
        for( int i =0;i<l;i++){
            for( int j= 0; j<h;j++){
                if(matrix[i][j]==target)
                f=1;
            }
        }
        if(f==1)
        return true;
        else 
        return false;
    }
}
