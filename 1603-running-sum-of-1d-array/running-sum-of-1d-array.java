class Solution {
    private int rec(int[] nums,int i,int[] res)
    {
        if(i<0) return 0;
        res[i] = nums[i]+rec(nums,i-1,res);
        return res[i];
    }
    public int[] runningSum(int[] nums) {
        int[] res = new int[nums.length];
        rec(nums,nums.length-1,res);
        return res;
    }
}