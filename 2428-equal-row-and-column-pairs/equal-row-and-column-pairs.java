class Solution {
    public int equalPairs(int[][] grid) {
        ArrayList<int[]> row = new ArrayList<>();
        ArrayList<int[]> col = new ArrayList<>();
        int count=0;
        for(int i=0;i<grid.length;i++)
        {
            row.add(grid[i]);
        }

        for(int i=0;i<grid.length;i++){
           int[] temp = new int[grid.length];
            for(int j=0;j<grid[i].length;j++)
            {
                temp[j]=grid[j][i];
            }
            col.add(temp);
        }

        for(int i=0;i<row.size();i++)
        {
            for(int j=0;j<col.size();j++)
            {
                if(Arrays.equals(row.get(i),col.get(j)))
                {
                    count++;
                }
            }
        }
        return count;
    }
}