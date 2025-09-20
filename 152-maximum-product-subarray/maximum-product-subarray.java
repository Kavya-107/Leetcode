class Solution {
    public int maxProduct(int[] nums) {
        int res=-1111111;
        int curmin=1;
        int curmax=1;

        for(int num:nums)
        {
            int t1=curmax*num;
            int t2=curmin*num;
            curmax=Math.max(t1,Math.max(num,t2));
            curmin=Math.min(t1,Math.min(num,t2));
            res=Math.max(curmax,res);
        }
        return res;        
    }
}