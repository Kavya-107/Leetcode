class Solution {
    public int minimumCost(int[] nums) {
        int min,smin;
        min = smin = Integer.MAX_VALUE;
        for(int i=1;i<nums.length;i++){
            if(min>nums[i]){
                smin = min;
                min = nums[i];
            }
            else if(smin>nums[i]){
                smin = nums[i];
            }
        }
        
        return nums[0]+min+smin;
    }
}