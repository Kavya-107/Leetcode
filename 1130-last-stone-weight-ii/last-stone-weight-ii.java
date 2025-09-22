class Solution {
    public int lastStoneWeightII(int[] stones) {
        int sum=0;

        for(int num:stones)
        {
            sum+=num;
        }

        int target=sum/2;

        boolean[] dp=new boolean[1+target];
        dp[0]=true;
        for(int num: stones)
        {
            for(int i=target;i>=num;i--)
            {
                dp[i]=dp[i]||dp[i-num];
            }
        }
        int i;
        for(i=target;i>=0;i--)
        {
            if(dp[i]) break;
        }
        System.out.println(i);
        return sum-i*2;
    }
}