class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int r=grid.length;
        int c=grid[0].length;
        int max=0;
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                if(grid[i][j]==1)
                {
                    max=Math.max(max,dfs(grid,i,j,r,c));
                }
            }
        }
        return max;
    }

    private int dfs(int[][] grid,int i,int j,int r,int c)
    {
        if(i<0 || i>=r || j<0 || j>=c || grid[i][j]==0)
        {
            return 0;
        }

        int sum=grid[i][j];
        grid[i][j]=0;
        sum+=dfs(grid,i+1,j,r,c);
        sum+=dfs(grid,i-1,j,r,c);
        sum+=dfs(grid,i,j+1,r,c);
        sum+=dfs(grid,i,j-1,r,c);

        return sum;

    }
}