class Solution {
    public int findMaxFish(int[][] grid) {
        int r=grid.length;
        int c=grid[0].length;
        int max=0;
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                if(grid[i][j]!=0)
                {
                    max=Math.max(dfs(grid,i,j,r,c),max);
                }
                
            }
        }
        return max;
        
    }

    int dfs(int[][] grid,int i,int j,int r,int c)
    {
        int sum;
        if(i<0||i>=r||j<0||j>=c||grid[i][j]==0){
            return 0;
        }

        sum=grid[i][j];
        grid[i][j]=0;
        sum+=dfs(grid,i-1,j,r,c);
        sum+=dfs(grid,i+1,j,r,c);
        sum+=dfs(grid,i,j-1,r,c);
        sum+=dfs(grid,i,j+1,r,c);

       return sum;
    }
}