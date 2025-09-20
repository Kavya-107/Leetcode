class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int row=text1.length();
        int col=text2.length();
        
        char[] t1=text1.toCharArray();
        char[] t2=text2.toCharArray();

        int[][] dp=new int[row+1][col+1];

        for(int i=1;i<=row;i++)
        {
            for(int j=1;j<=col;j++)
            {
                if(t1[i-1]==t2[j-1]) {
                    dp[i][j]=1+dp[i-1][j-1];
                }
                else
                dp[i][j]=Math.max(dp[i][j-1],dp[i-1][j]);
            }
        }
        return dp[row][col];
    }

}