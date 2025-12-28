class Solution {
    public int countNegatives(int[][] grid) {
        int c=0;
        
        for(int i=0;i<grid.length;i++)
        {
            int row = grid[i].length;
           for(int j=0;j<row;j++){
            if(grid[i][j]<0){
                c+=(row-j);
                break;
            }
           }
        }
        return c;
    }
}