class Solution {
    public int minDistance(String word1, String word2) {


        int row=word1.length();
        int col=word2.length();

        char[] w1=word1.toCharArray();
        char[] w2=word2.toCharArray();


        int[][] dp = new int[row+1][col+1];

        for(int i=0;i<row+1;i++)
        {
            dp[i][0]=i;
        }

        for(int i=0;i<=col;i++)
        {
            dp[0][i]=i;
        }

        for(int i=1;i<=row;i++)
        {
            for(int j=1;j<=col;j++)
            {
                if(w1[i-1]==w2[j-1]) dp[i][j]=dp[i-1][j-1];
                else{
                    dp[i][j]=1+Math.min(dp[i][j-1],Math.min(dp[i-1][j],dp[i-1][j-1]));
                }
            }
        }
        return dp[row][col];
    }
}