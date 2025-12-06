class Solution {
    
    public int maxProfit(int[] prices) {
        int profit=0,min=prices[0];
        for(int i=0;i<prices.length;i++)
        {
            min=min<prices[i]?min:prices[i];
            profit=(prices[i]-min)>profit?prices[i]-min:profit;
        }
    return profit;
    }
}