class Solution {
    public void rotate(int[][] matrix) {
        int n= matrix.length;
        int m=matrix[0].length;
        int t=0;
        for(int i=t;i<n;i++){
            for(int j=t+1;j<m;j++){
                
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
            t++;
        }

        for(int i=0;i<n;i++)
        {
            int j=0;
            int k=m-1;
            while(j<k){
                int temp = matrix[i][k];
                matrix[i][k] = matrix[i][j];
                matrix[i][j] = temp;
                j++;
                k--;
            }
        }
        
    }
}