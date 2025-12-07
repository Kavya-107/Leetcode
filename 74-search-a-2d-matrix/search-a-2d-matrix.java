class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {

        if(matrix.length != 0 && matrix[0][0] == target)  return true;
        int i=0;
        for(i=0;i<matrix.length;i++)
        {
            if(matrix[i][0]>target) break;
        }

        if(i==0) return false;

        System.out.println(i);

        for(int j=0;j<matrix[i-1].length;j++)
        {
            if(matrix[i-1][j]== target) return true;
        }
        return false;
    }
}