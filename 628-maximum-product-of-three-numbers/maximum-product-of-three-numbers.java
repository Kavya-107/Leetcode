class Solution {
    public int maximumProduct(int[] nums) {
        if(nums.length==3) return nums[0]*nums[2]*nums[1];
        else{
            int max=Integer.MIN_VALUE;
            Arrays.sort(nums);
            int o = nums[nums.length-1]*nums[nums.length-2]*nums[nums.length-3];
            int t = nums[0]*nums[1]*nums[nums.length-1];
            return Math.max(o,t);
        }
    }
}