class Solution {
    public boolean exist(char[][] board, String word) {
        int r=board.length;
        int c=board[0].length;
        
        boolean[][] vis = new boolean[r][c];

        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                if(board[i][j] == word.charAt(0))
                if(dfs(board,word,vis,i,j,r,c,0)) return true;
            }
        }
        return false;
    }

    private boolean dfs(char board[][],String word,boolean[][] vis,int i,int j,int r, int c,int ind)
    {
        if(ind==word.length())
        {
            return true;
        }
        if(i<0 || i>=r || j<0 || j>=c || vis[i][j] || board[i][j]!=word.charAt(ind))
        {
            return false;
        }

        vis[i][j] = true;

        if(dfs(board,word,vis,i-1,j,r,c,ind+1) || dfs(board,word,vis,i+1,j,r,c,ind+1) || dfs(board,word,vis,i,j-1,r,c,ind+1) || dfs(board,word,vis,i,j+1,r,c,ind+1)){
            return true;
        }
        vis[i][j]=false;
        return false;
    }
}