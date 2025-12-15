class Solution {
    public void setZeroes(int[][] matrix) {
        ArrayList<Integer> row = new ArrayList<>();
        ArrayList<Integer> col = new ArrayList<>();

        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                if(matrix[i][j] == 0){
                    if(!row.contains(i)) row.add(i);
                    if(!col.contains(j)) col.add(j);
                }
            }
        }
        for(int a : row){
            for(int i=0;i<matrix[0].length;i++)
            {
                matrix[a][i] = 0;
            }
        }
        for(int a : col){
            for(int i=0;i<matrix.length;i++)
            {
                matrix[i][a] = 0;
            }
        }
    }
}